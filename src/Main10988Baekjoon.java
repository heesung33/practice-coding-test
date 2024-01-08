import java.util.Scanner;

public class Main10988Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        if(s.equals(String.valueOf(sb))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
