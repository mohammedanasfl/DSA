package string;

import java.time.LocalDate;

public class DaysBetweenDates {
    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2020-01-15", "2019-12-31")); // Output: 15
        System.out.println(daysBetweenDates("2019-12-31", "2020-01-15")); // Output: 15
    }

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);

        int count = 0;

        if (localDate1.isAfter(localDate2)) {
            LocalDate temp = localDate1;
            localDate1 = localDate2;
            localDate2 = temp;
        }

        while (!localDate1.equals(localDate2)) {
            localDate1 = localDate1.plusDays(1);
            count++;
        }

        return count;
    }
}

