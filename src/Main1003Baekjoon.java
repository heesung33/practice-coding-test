import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1003Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        String[] result = new String[n];
        for(int j = 0; j<n; j++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int m = Integer.parseInt(st2.nextToken());
            int[] dp = new int[m+1];
            int[] dp2 = new int[m+1];
            dp[0] =  1;
            dp2[0] = 0;
            if(m>=1) {
                dp[1] = 0;
                dp2[1] = 1;
            }
            for(int i = 2; i <=m; i++){
                dp[i] = dp[i-1] + dp[i-2];
                dp2[i] = dp2[i-1] + dp2[i-2];
            }
            result[j] = dp[m] + " " + dp2[m];
        }
        for(int i = 0; i< n; i++) {
            System.out.println(result[i]);
        }
    }
}
