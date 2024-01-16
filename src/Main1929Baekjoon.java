import java.io.*;
import java.util.StringTokenizer;

public class Main1929Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] result = new boolean[m + 1];
        result[0] = result[1] = true;
        for (int i = 2; i <= m; i++) {
            if (result[i] == true) {
                continue;
            }
            for (int j = i + i; j <= m; j += i) {
                result[j] = true;
            }
        }
        for (int i = n; i <= m; i++) {
            if (!result[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
