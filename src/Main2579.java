import java.util.Scanner;

public class Main2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] S = new int[301];
        int[] dp = new int[301];

        for (int i = 1; i <= N; i++) {
            S[i] = sc.nextInt();
        }

        dp[1] = S[1];
        dp[2] = S[1] + S[2];
        dp[3] = Math.max(S[1], S[2]) + S[3];

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i - 3] + S[i - 1], dp[i - 2]) + S[i];
        }

        System.out.println(dp[N]);
    }
}