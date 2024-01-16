import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10989Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(bf.readLine());
            result[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(result);
        for(int i : result) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
