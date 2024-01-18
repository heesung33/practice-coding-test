import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            long H = Integer.parseInt(st2.nextToken());
            long W = Integer.parseInt(st2.nextToken());
            long N = Integer.parseInt(st2.nextToken());
            long cal = 0;
            if (N % H == 0) {
                cal = H;
            } else {
                cal = N % H;
            }
            sb.append((cal * 100) + (long)(Math.ceil(Double.parseDouble(String.valueOf(N)) / Double.parseDouble(String.valueOf(H))))).append("\n");
        }
        System.out.print(sb);
    }
}
