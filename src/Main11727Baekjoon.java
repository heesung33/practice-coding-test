import java.util.Scanner;

public class Main11727Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        dp[1] = 1;
        if (n >= 2) {
            dp[2] = 3;
            for (int i = 3; i < dp.length; i++) {
                dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
            }
        }
        System.out.println(dp[n]);
    }
}
