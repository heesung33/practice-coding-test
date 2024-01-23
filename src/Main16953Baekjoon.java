import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main16953Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long[] dp = new long[1000];
        dp[1] = b;
        int i = 1;
        while (true) {
            i++;
            if (dp[i - 1] % 2 == 0) {
                dp[i] = dp[i - 1] / 2;
            } else {
                if(dp[i-1] % 10 == 1) {
                    int cal = (int) (dp[i-1] / 10);
                    if(cal < a) {
                        i = -1;
                        break;
                    }
                    dp[i] = cal;
                } else {
                    i = -1;
                    break;
                }
            }
            if(dp[i] == a) {
                break;
            }
        }
        System.out.println(i);
    }
}
