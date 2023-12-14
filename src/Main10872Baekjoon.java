import java.util.Scanner;

public class Main10872Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        for (int i = n; i >= 1; i--) {
            temp *= i;
        }

        System.out.println(temp);
    }
}
