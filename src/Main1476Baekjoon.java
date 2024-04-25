import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1476Baekjoon {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A = 1;
        int B = 1;
        int C = 1;
        int count = 1;
        while (true) {
            if (A == E && B == S && C == M) {
                break;
            }
            A++;
            B++;
            C++;
            count++;
            if (A > 15) {
                A -= 15;
            }
            if (B > 28) {
                B -= 28;
            }
            if (C > 19) {
                C -= 19;
            }
        }
        System.out.print(count);
    }
}
