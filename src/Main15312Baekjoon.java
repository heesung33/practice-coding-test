import java.util.Scanner;

public class Main15312Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String w = sc.next();
        int length = m.length() + w.length();
        int[][] dp = new int[length][length];
        int j = 0;
        int[] alpa = new int[] {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        for (int i = 0; i < w.length(); i++) {
            dp[0][j] = alpa[m.charAt(i)-65];
            dp[0][j + 1] = alpa[w.charAt(i)-65];
            j += 2;
        }
        int cal = length -1;
        for (int i = 1; i < length - 1; i++) {
            for(int k = 0; k < cal; k++) {
                if(dp[i-1][k] + dp[i-1][k+1] >=10) {
                    dp[i][k] = (dp[i-1][k] + dp[i-1][k+1]) - 10;
                } else {
                    dp[i][k] = dp[i-1][k] + dp[i-1][k+1];
                }
            }
            cal --;
        }
        System.out.print(dp[length-2][0] + "" + dp[length-2][1]);

    }
}
