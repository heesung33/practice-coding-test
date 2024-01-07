import java.util.Scanner;

public class Main14916Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 0;

        if (n >= 2) {
            dp[2] = 1;
            if (n >= 3) {
                dp[3] = 0;

                for (int i = 4; i <= n; i++) {
                    dp[i] = dp[i - 2] + 1;
                    if (i % 2 == 0) {
                        dp[i] = Math.min(i / 2, dp[i]);
                    }
                    if (i % 5 == 0) {
                        dp[i] = Math.min(i / 5, dp[i]);
                    }
                }
            }
        }
        if (dp[n] == 0) {
            System.out.print(-1);
        } else {
            System.out.print(dp[n]);
        }
    }
}
