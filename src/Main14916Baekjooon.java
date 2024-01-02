import java.util.Scanner;

public class Main14916Baekjooon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 0;
        for (int i = 4; i <= n; i++) {
            if(n%2 != 0) {
                dp[i] = dp[i - 2] + 1;
            } else {
                
            }
        }
        System.out.println(dp[n]);
    }
}
