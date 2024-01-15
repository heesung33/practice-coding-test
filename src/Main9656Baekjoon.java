import java.util.Scanner;

public class Main9656Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String dp[] = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            if(i %2== 0) {
                dp[i] = "SK";
            } else {
                dp[i] = "CY";
            }
        }
        System.out.print(dp[n]);
    }
}
