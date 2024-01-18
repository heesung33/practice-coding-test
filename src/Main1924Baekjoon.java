import java.time.LocalDate;
import java.util.Scanner;

public class Main1924Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        LocalDate date = LocalDate.of(2007, month, day);
        System.out.println(String.valueOf(date.getDayOfWeek()).substring(0, 3));
    }
}
