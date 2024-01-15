import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Main1904Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] dp = new long[n + 1];
        dp[1] = 1;
        if(n>=2) {
            dp[2] = 2;
            if(n>=3) {
                dp[3] = 3;
                for (int i = 4; i <= n; i++) {
                    dp[i] = (dp[i-1] + dp[i-2]) % 15746;
                }
            }
        }
        System.out.print(dp[n]);
    }
}
