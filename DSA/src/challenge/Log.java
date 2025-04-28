package challenge;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Log {
    public static void main(String[] args) {
        List<String> logLines = Arrays.asList(
                "[INFO] 2025-04-15 10:00:00 - Server started",
                "[ERROR] 2025-04-15 10:02:30 - Failed to connect to DB",
                "[INFO] 2025-04-15 10:03:00 - Retrying DB connection",
                "[WARNING] 2025-04-15 10:03:10 - DB slow response",
                "[ERROR] 2025-04-15 10:05:00 - Timeout on request /api/user"
        );
        List<LogEntry>list=new ArrayList<>();
        for(String s:logLines){
            String []line =s.split(" ");
            String level = line[0].replaceAll("[\\[\\]]", "");
            LogEntry logEntry=new LogEntry(level,line[1].trim(),line[2].trim(),line[4].trim());
            list.add(logEntry);
        }
        list.sort(Comparator.comparing(LogEntry::getLocalTime));
        list.forEach(System.out::println);

    }
}
class LogEntry{
    String level;
    LocalDate localDate;
    LocalTime localTime;
    String message;

    public LogEntry(String level, String dateStr, String timeStr, String message) {
        this.level = level;
        this.localDate = LocalDate.parse(dateStr);  // Assumes format is ISO: yyyy-MM-dd
        this.localTime = LocalTime.parse(timeStr);  // Assumes format is HH:mm:ss
        this.message = message;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return "LogEntry{  " +
                "level='" + level + '\'' +
                ", localDate=" + localDate +
                ", localTime=" + localTime +
                ", message='" + message + '\'' +
                '}';
    }
}
