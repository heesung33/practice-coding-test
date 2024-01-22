import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5086Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(n == 0 && b == 0) {
                break;
            }
            if(b%n==0) {
                System.out.println("factor");
            } else if(n%b==0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
