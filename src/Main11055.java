import java.util.Scanner;

public class Main11055 {
    public static void main(String[] args) {
        int[] dp = new int[1001];
        int[] S = new int[1001];

        int max = -1;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i<=N; i++) {
            S[i] = sc.nextInt();
        }

        dp[1] = S[1];

        for(int i=2; i<=N;i++) {
            dp[i] = S[i];
            for(int j = 1; j<=N; j++) {
                if(S[j]<S[i]) {
                    dp[i] = Math.max(S[i] + dp[j], dp[i]);
                }
            }
        }

        for(int i=1; i<=N; i++) {
            if(dp[i]>max) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }

}
