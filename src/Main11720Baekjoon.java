import java.util.Scanner;

public class Main11720Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n == s.length()) {
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                temp += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            System.out.println(temp);
        }
    }
}
