import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12852Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];
        String[] dp2 = new String[n + 1];
        dp[1] = 0;
        dp2[1] = "1";
        if(n>=2) {
            dp[2] = 1;
            dp2[2] = "2 1";
            if(n>=3) {
                dp[3] = 1;
                dp2[3] = "3 1";
                for (int i = 4; i <= n; i++) {
                    String s = i + " ";
                    if (i % 3 == 0) {
                        if (dp[i / 3] + 1 > dp[i - 1] + 1) {
                            dp[i] = dp[i - 1] + 1;
                            dp2[i] = s.concat(dp2[i - 1]);
                        } else {
                            dp[i] = dp[i / 3] + 1;
                            dp2[i] = s.concat(dp2[i / 3]);
                        }
                    } else if (i % 2 == 0) {
                        if (dp[i / 2] + 1 > dp[i - 1] + 1) {
                            dp[i] = dp[i - 1] + 1;
                            dp2[i] = s.concat(dp2[i - 1]);
                        } else {
                            dp[i] = dp[i / 2] + 1;
                            dp2[i] = s.concat(dp2[i / 2]);
                        }
                    } else {
                        dp[i] = dp[i - 1] + 1;
                        dp2[i] = s.concat(dp2[i - 1]);
                    }
                    if(i % 3==0 && i % 2==0) {
                        if(dp[i] > dp[i / 2] + 1) {
                            dp[i] = dp[i / 2] + 1;
                            dp2[i] = s.concat(dp2[i / 2]);
                        }
                    }
                }
            }
        }
        System.out.println(dp[n]);
        System.out.print(dp2[n]);
    }
}
