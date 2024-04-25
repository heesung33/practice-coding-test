import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main10699Baekjoon {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(dateTimeFormatter));
    }
}
