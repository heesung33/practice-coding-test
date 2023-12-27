import java.util.Scanner;

public class Main11653Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;

        for (int i = 2; i * i <= n; i++) {
            while (x % i == 0) {
                System.out.println(i);
                x /= i;
            }
        }

        if (x > 1) {
            System.out.println(x);
        }
    }
}
