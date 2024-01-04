import java.util.Scanner;

public class Main15988Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long[] dp = new long[m + 1];
            dp[0] = 0;
            dp[1] = 1;
            if(m>=2) {
                dp[2] = 2;
                if(m>=3) {
                    dp[3] = 4;
                    for (int j = 4; j <= m; j++) {
                        dp[j] = (dp[j - 3] + dp[j - 2] + dp[j - 1]) % 1000000009;
                    }
                }
            }
            sb.append(dp[m]).append("\n");
        }
        System.out.print(sb);
    }
}
