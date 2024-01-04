import java.util.Scanner;

public class Main2775Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < n; k++) {
            int ch = sc.nextInt();
            int ho = sc.nextInt();
            int[][] dp = new int[ch + 1][15];
            dp[0][1] = 1;
            dp[0][2] = 2;
            dp[0][3] = 3;
            dp[0][4] = 4;
            dp[0][5] = 5;
            dp[0][6] = 6;
            dp[0][7] = 7;
            dp[0][8] = 8;
            dp[0][9] = 9;
            dp[0][10] = 10;
            dp[0][11] = 11;
            dp[0][12] = 12;
            dp[0][13] = 13;
            dp[0][14] = 14;

            for (int i = 1; i <= ch; i++) {
                for (int j = 1; j <= ho; j++) {
                    int temp = 0;
                    for (int y = 1; y <= j; y++) {
                        temp += dp[i-1][y];
                    }
                    dp[i][j] = temp;
                }
            }
            sb.append(dp[ch][ho]).append("\n");
        }
        System.out.print(sb);
    }
}
