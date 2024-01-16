import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2798Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        int result = 0;
        loop:
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int y = j + 1; y < n; y++) {
                    int temp = arr[i] + arr[j] + arr[y];
                    if (temp == m) {
                        result = temp;
                        break loop;
                    }
                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }

        System.out.print(result);

    }
}
