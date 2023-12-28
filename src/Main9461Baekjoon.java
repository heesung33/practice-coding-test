import java.util.Scanner;

public class Main9461Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int result = sc.nextInt();
            long[] dp = new long[101];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;
            dp[6] = 3;
            dp[7] = 4;
            dp[8] = 5;
            dp[9] = 7;
            dp[10] = 9;
            if (result >= 11) {
                for (int j = 11; j < result + 1; j++) {
                    dp[j] = dp[j - 1] + dp[j - 2] - dp[j - 4];
                }
            }
            sb.append(dp[result]).append("\n");
        }
        System.out.println(sb);
    }
}
