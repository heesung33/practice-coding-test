import java.util.Scanner;

public class Main9095Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] dp = new long[12];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        int r = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < r; j++) {
            int n = sc.nextInt();
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}
