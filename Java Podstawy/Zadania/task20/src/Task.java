import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task {
    public static void main(String[] args) {
        calculateDifference("2014::01::23", "03--2020-30");
    }

    public static int[] calculateDifference(String dateAString, String dateBString) {
        System.out.println(dateAString);
        System.out.println(dateBString);
        // YYYY-MM-DD -> standardowy format
        //przygotowanie niestandardowych formatów
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM--yyyy-dd");
        LocalDate dateA = LocalDate.parse(dateAString,formatter1);
        LocalDate dateB = LocalDate.parse(dateBString,formatter2);

        LocalDate dateBefore;
        LocalDate dateAfter;

        if (dateA.isBefore(dateB)) {
            dateBefore = dateA;
            dateAfter = dateB;
        } else {
            dateBefore = dateB;
            dateAfter = dateA;
        }

        System.out.println("Before: " + dateBefore);
        System.out.println("After: " + dateAfter);
        int yearsBetween  =(int) dateBefore.until(dateAfter, ChronoUnit.YEARS);
        int monthsBetween =(int) dateBefore.until(dateAfter, ChronoUnit.MONTHS);
        int daysBetween =  (int) dateBefore.until(dateAfter, ChronoUnit.DAYS);
        int[] results = {yearsBetween, monthsBetween, daysBetween};
        return results;
    }
}