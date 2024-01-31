import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10953Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.println(Integer.parseInt(String.valueOf(s.charAt(0))) + Integer.parseInt(String.valueOf(s.charAt(2))));
        }
    }
}
