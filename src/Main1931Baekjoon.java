import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1931Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] result = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            result[i][0] = Integer.parseInt(st2.nextToken());
            result[i][1] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(result, (num1, num2) -> {
            if (num1[1] == num2[1]) {
                return num1[0] - num2[0];
            } else {
                return num1[1] - num2[1];
            }
        });
        int cal = 0;
        int start = result[0][1];
        for (int i = 1; i < n; i++) {
            if (result[i][0] >= start) {
                start = result[i][1];
                cal++;
            }
        }
        System.out.print(cal + 1);
    }
}
