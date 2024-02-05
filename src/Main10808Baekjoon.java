import java.util.Scanner;

public class Main10808Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        for (int i = 65; i <= 90; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == (char) i) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
