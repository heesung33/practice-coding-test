import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10798Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < 15; j++) {
                try {
                    arr[i][j] = s.charAt(j);
                } catch (Exception e) {
                    arr[i][j] = '*';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j <5; j++) {
                if(String.valueOf(arr[j][i]).equals("*")) {
                    continue;
                }
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}
