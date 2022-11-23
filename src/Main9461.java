import java.util.Scanner;

public class Main9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] dp = new long[101];
        long[] a = new long[101];

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

        for(int i = 11; i<=100; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }

        for(int i= 0; i<N; i++) {
            int t = sc.nextInt();
            a[i] = dp[t];
        }
        for(int i = 0; i<N; i ++) {
            System.out.println(a[i]);
        }

    }
}
