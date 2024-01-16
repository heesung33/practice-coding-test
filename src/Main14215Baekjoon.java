import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14215Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] result = new int[]{a, b, c};
        Arrays.sort(result);
        if(result[0] + result[1] <=result[2]){
            System.out.print(((a + b + c - result[2]) * 2) - 1);
        } else {
            System.out.println(a+b+c);
        }
    }
}
