import java.time.LocalDate;

public class Solution2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2022-09-26");

        int numberOfDay = date.getDayOfWeek().getValue();

        if (numberOfDay >= 2) {
            date = date.plusDays(7 - (numberOfDay - 2));
        } else {
            date = date.plusDays(numberOfDay);
        }
        System.out.println(date);
    }
}
