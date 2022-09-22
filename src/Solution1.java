import java.time.LocalDate;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = 0;
        System.out.println("Enter the day");
        while (true) {
            int dayCounter = 0;
            day = scanner.nextInt();
            if (day > 0 && day <= 31) {
                dayCounter++;
            } else {
                System.out.println("You entered wrong quantity of days. Try again");
            }
            if (dayCounter == 1) {
                break;
            }
        }

        int month = 0;
        System.out.println("Enter the month");
        while (true) {
            int monthCounter = 0;
            month = scanner.nextInt();
            if (month > 0 && month <= 12) {
                monthCounter++;
            } else {
                System.out.println("You entered wrong quantity of months. Try again");
            }
            if (monthCounter == 1) {
                break;
            }
        }
        System.out.println("Enter the year");

        LocalDate date = LocalDate.of(scanner.nextInt(), month, day);
        scanner.close();

        System.out.println(date.getDayOfWeek());

    }
}

