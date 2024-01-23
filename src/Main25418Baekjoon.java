import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main25418Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] dp = new int[b];
        int i = 1;
        dp[1] = b;
        while (true) {
            i++;
            if (dp[i - 1] % 2 != 0 || dp[i-1] / 2 < a) {
                dp[i] = dp[i - 1] - 1;
            } else {
                dp[i] = dp[i - 1] / 2;
            }
            if (dp[i] == a) {
                break;
            }
        }
        System.out.print(i-1);
    }
}
