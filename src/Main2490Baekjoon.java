import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2490Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i  = 0; i < 3; i++) {
            StringTokenizer st=  new StringTokenizer(br.readLine());
            int a = 0;
            for(int j = 0; j < 4; j++) {
                a += Integer.parseInt(st.nextToken());
            }
            if(a==3) {
                System.out.println("A");
            } else if (a ==2) {
                System.out.println("B");
            } else if (a== 1) {
                System.out.println("C");
            } else if (a ==0) {
                System.out.println("D");
            } else if (a==4) {
                System.out.println("E");
            }
        }
    }
}
