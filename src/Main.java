import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Input day you like");
//        Scanner scanner = new Scanner(System.in);
//        int date = scanner.nextInt();
//        System.out.println(showTheNextDay(date));

    }
    public static LocalDate showTheNextDay (int year, int month, int date) {
        LocalDate currentDate = LocalDate.of(year, month,date);
        return currentDate.plusDays(1);
    }

}
