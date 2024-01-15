import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2156Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            result[i] = Integer.parseInt(st2.nextToken());
        }
        int[] dp = new int[n + 1];
        dp[1] = result[1];
        if (n >= 2) {
            dp[2] = result[1] + result[2];
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + result[i], result[i - 1] + dp[i - 3] + result[i]));
        }
        System.out.print(dp[n]);

    }
}
