import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9657Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] dp = new String[n + 1];
        dp[1] = "SK";
        for (int i = 2; i <= n; i++) {
            if(i%7==0 || i%7==2) {
                dp[i] = "CY";
            } else {
                dp[i] = "SK";
            }
        }
        System.out.println(dp[n]);
    }
}
