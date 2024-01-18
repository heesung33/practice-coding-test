import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2920Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String sb = "";
        for(int i = 0; i < 8; i++) {
            sb = sb.concat(st.nextToken());
        }
        if(sb.equals("12345678")) {
            System.out.print("ascending");
        } else if (sb.equals("87654321")) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}
