import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1037Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        int cal = 2;
        if(n == 1) {
            System.out.print(BigInteger.valueOf(arr[0] * arr[0]));
        } else {
            while (true){
                boolean ty = false;
                int count = 0;
                for(int j = 2; j <= arr[arr.length -1]; j++) {
                    if((BigInteger.valueOf((arr[arr.length - 1] * cal)).remainder(BigInteger.valueOf(j))).equals(BigInteger.ZERO)) {
                        count++;
                    }
                }
                if(count == arr.length) {
                    for(int i =0; i < n; i++) {
                        if(!(BigInteger.valueOf((arr[arr.length - 1] * cal)).remainder(BigInteger.valueOf(arr[i]))).equals(BigInteger.ZERO)) {
                            ty = true;
                            break;
                        }
                    }
                } else {
                    ty = true;
                }

                if(!ty) {
                    break;
                } else {
                    cal++;
                }
            }
            System.out.print(BigInteger.valueOf(arr[arr.length-1] * cal));
        }
    }
}
