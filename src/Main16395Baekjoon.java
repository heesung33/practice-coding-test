import java.util.Scanner;

public class Main16395Baekjoon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        long[][] dp = new long[n+1][n+1];
        dp[1][1] = 1;
        if(n>=2) {
            dp[2][1] = 1;
            dp[2][2] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i][1] = 1;
                dp[i][i] = 1;
                for (int j = 2; j < i; j++) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        System.out.print(dp[n][b]);
    }
}
