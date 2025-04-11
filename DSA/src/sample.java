import java.io.*;
import java.util.*;
import java.util.regex.*;

public class sample {
    public static void main(String[] args) {
        String errorFile = "C:\\Users\\m_nagoorm\\Error_nissanDDIparts.GASS.DE.D210325.T054501.csv";
        String dataFile = "C:\\Users\\m_nagoorm\\nissanDDIparts.GASS.DE.D210325.T054501.csv";

        Map<Integer, Integer> errorLocations = parseErrorLog(errorFile);
        locateErrorsInFile(dataFile, errorLocations);
    }

    // Parses the error log to map row numbers to column indexes
    private static Map<Integer, Integer> parseErrorLog(String filePath) {
        Map<Integer, Integer> errorLocations = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("Row ID")) continue; // Skip headers

                String[] parts = line.split("\\|");
                if (parts.length > 1) {
                    try {
                        int rowId = Integer.parseInt(parts[0].replaceAll("\"", "").trim());
                        line = br.readLine(); // Read the next line for column info
                        int columnIndex = extractColumnNumber(line);
                        if (columnIndex != -1) {
                            errorLocations.put(rowId, columnIndex);
                        }
                    } catch (NumberFormatException | IOException ignored) {}
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return errorLocations;
    }

    // Extracts column number from the error description
    private static int extractColumnNumber(String errorDesc) {
        String[] tokens = errorDesc.split("column:");
        if (tokens.length > 1) {
            try {
                return Integer.parseInt(tokens[1].replaceAll("[^0-9]", "").trim());
            } catch (NumberFormatException ignored) {}
        }
        return -1;
    }

    // Locates errors in the CSV data file and prints the affected row and column
    private static void locateErrorsInFile(String filePath, Map<Integer, Integer> errorLocations) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (errorLocations.containsKey(lineNum)) {
                    int columnIndex = errorLocations.get(lineNum);
                    String[] columns = splitCSVLine(line);

                    System.out.println("Error at Row: " + lineNum + ", Column: " + columnIndex);
                    System.out.println("Full Line Content: " + line);

                    if (columnIndex > 0 && columnIndex <= columns.length) {
                        System.out.println("Error Column Content: " + columns[columnIndex - 1]);
                    } else {
                        System.out.println("Column index out of bounds!");
                    }

                    System.out.println("---------------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Splits CSV lines correctly while respecting quoted values
    private static String[] splitCSVLine(String line) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("\"([^\"]*)\"|([^,|]+)").matcher(line);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                result.add(matcher.group(1)); // Quoted value
            } else {
                result.add(matcher.group(2)); // Unquoted value
            }
        }
        return result.toArray(new String[0]);
    }
}
