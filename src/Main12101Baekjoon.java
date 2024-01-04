import java.util.Scanner;

public class Main12101Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[12];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        int heap = 0;
        for(int i = 0; i<=n; i++) {
            heap += dp[n];
        }
        String[][] dpString = new String[12][heap + 1];
        dpString[0][0] = "";

        dpString[1][1] = "1";

        dpString[2][1] = "1+1";
        if(n>=2) {
        dpString[2][2] = "2";

        dpString[3][1] = "1+1+1";
        dpString[3][2] = "1+2";
        if(n>=3){
            dpString[3][3] = "2+1";
            dpString[3][4] = "3";
        }
        }
        int k = sc.nextInt();
        if(dp[n]<k) {
            System.out.print(-1);
        } else {
            for (int i = 4; i <= n; i++) {
                int y = 1;
                int temp = 1;
                int result = 1;
                while (true) {
                    if (dpString[i - temp][result] != null && temp!=4) {
                        String s = dpString[i - temp][result];
                        dpString[i][y] = String.valueOf(temp).concat("+").concat(s);
                        y++;
                        result++;
                    } else if (temp == 4) {
                        break;
                    } else if (dpString[i - temp][result] == null) {
                        result = 1;
                        temp += 1;
                    }

                }
            }
            System.out.print(dpString[n][k]);
        }
    }
}
