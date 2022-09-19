import java.time.LocalDate;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = 0;
        int dayCounter = 0;
        System.out.println("Enter the day");
        while (dayCounter < 1) {
            day = scanner.nextInt();
            if (day > 0 && day < 31) {
                dayCounter++;
            } else {
                System.out.println("You entered wrong quantity of days. Try again");
            }
        }

        int month = 0;
        int monthCounter = 0;
        System.out.println("Enter the month");
        while (monthCounter < 1) {
            month = scanner.nextInt();
            if (month > 0 && month < 12) {
                monthCounter++;
            } else {
                System.out.println("You entered wrong quantity of months. Try again");
            }
        }
        scanner.close();
        LocalDate date = LocalDate.of(scanner.nextInt(), month, day);
        System.out.println(date.getDayOfWeek());
    }

       /* System.out.println("Enter the year, month and day:");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();
        System.out.println(date.getDayOfWeek());*/

}

