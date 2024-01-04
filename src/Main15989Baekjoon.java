import java.util.Scanner;

public class Main15989Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int[][] dp = new int[10001][4];
            dp[1][1] = 1; // 1
            dp[2][1] = 1; // 1 + 1
            dp[2][2] = 1; // 2
            dp[3][1] = 1; // 1 + 1 + 1
            dp[3][2] = 1; // 1 + 2
            dp[3][3] = 1; // 3

            for (int j = 4; j <= x; j++) {
                dp[j][1] = dp[j-1][1];
                dp[j][2] = dp[j-2][1] + dp[j-2][2];
                dp[j][3] = dp[j-3][1] + dp[j-3][2] + dp[j-3][3];
            }
            sb.append(dp[x][1] + dp[x][2] + dp[x][3]).append("\n");
        }
        System.out.print(sb);
    }
}
