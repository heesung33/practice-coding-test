import java.util.Scanner;

public class Main14606Baekjoon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int dp[] = new int[n+1];
        dp[1] = 0;
        if(n>=2) {
            dp[2] = 1;
            if(n>=3) {
                dp[3] = 3;
                for (int i = 4; i <= n; i++) {
                    dp[i] = dp[i - 1] + i - 1;
                }
            }
        }
        System.out.print(dp[n]);
    }
}
