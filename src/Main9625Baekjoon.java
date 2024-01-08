import java.util.Scanner;
import java.util.StringTokenizer;

public class Main9625Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dp = new String[n + 1];
        dp[1] = "0 1";
        if(n>=2) {
            dp[2] = "1 1";
            if(n>=3) {
                dp[3] = "1 2";
                for (int i = 4; i <= n; i++) {
                    StringBuilder sb = new StringBuilder();
                    StringTokenizer st = new StringTokenizer(dp[i - 1]);
                    StringTokenizer st2 = new StringTokenizer(dp[i - 2]);
                    int first = Integer.parseInt(st.nextToken()) + Integer.parseInt(st2.nextToken());
                    int sec = Integer.parseInt(st.nextToken()) + Integer.parseInt(st2.nextToken());
                    dp[i] = String.valueOf(sb.append(first).append(" ").append(sec));
                }
            }
        }
        System.out.println(dp[n]);
    }
}
