package string;

public class ValidIpAddress {
    public static boolean isValid(String s) {

        String[] arr = s.split("\\.");
        if (arr.length != 4) return false;

        for (String part : arr) {
            if (part.isEmpty()) return false;

            // Check if all characters are digits
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }

            // No leading zeros unless single zero
            if (part.length() > 1 && part.startsWith("0")) return false;

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isValid("255..255.255"));
    }
}
