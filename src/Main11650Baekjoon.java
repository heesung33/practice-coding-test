import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main11650Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Arrays = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays[i][0] = sc.nextInt();
            Arrays[i][1] = sc.nextInt();
        }
        java.util.Arrays.sort(Arrays, (num1, num2) -> {
            if(num1[0]==num2[0]) {
                return num1[1] - num2[1];
            } else {
                return num1[0] - num2[0];
            }
        });
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(Arrays[i][0]).append(" ").append(Arrays[i][1]).append("\n");
        }
        System.out.print(s);
    }
}
