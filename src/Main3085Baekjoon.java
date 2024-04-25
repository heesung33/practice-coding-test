import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3085Baekjoon {
    static int arr[][];
    static int max = 0;
    static int count = 0;
    static int N = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        // 행끼리 교환 및 비교
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                swap(i, j, i, j + 1);
                search();
                swap(i, j + 1, i, j);
            }
        }

        // 열끼리 교환 및 비교
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                swap(j, i, j+1, i);
                search();
                swap(j+1, i, j, i);
            }
        }
        System.out.println(max);
    }

    private static void swap(int x1, int y1, int x2, int y2) {
        int temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    private static void search() {
        // 열끼리 비교
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (arr[j][i] == arr[j + 1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
        // 행끼리 비교
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
    }
}
