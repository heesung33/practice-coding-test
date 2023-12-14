import java.util.Scanner;

public class Main2588Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        for (int i = B.length() - 1; i >= 0; i--) {
            int temp = 0;
            int cal = 1;
            for (int j = A.length() - 1; j>=0; j--) {
                temp += Integer.parseInt(String.valueOf(B.charAt(i))) * Integer.parseInt(String.valueOf(A.charAt(j))) * cal;
                cal *= 10;
            }
            System.out.println(temp);
        }
        System.out.println(Integer.parseInt(A) * Integer.parseInt(B));
    }
}
