import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1259Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("0")) {
                break;
            }
            String check = "";
            for(int i = s.length() -1; i >=0; i--) {
                check = check.concat(String.valueOf(s.charAt(i)));
            }
            if(check.equals(s)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
