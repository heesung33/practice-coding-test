import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13458Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 시험장 갯수

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[A]; // 시험장마다 응시자 수
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        long B = Integer.parseInt(st.nextToken()); // 총감독
        long C = Integer.parseInt(st.nextToken()); // 부감독
        long temp = 0;
        for(int i = 0; i < arr.length; i++) {
            long temp2 = 0;

            long cal = arr[i];
            cal = cal - B;
            temp2++;
            if(cal > 0) {
                temp2 += cal / C;
                if(cal % C !=0) {
                    temp2++;
                }
            }
            temp +=temp2;
        }
        System.out.println(temp);
    }
}
