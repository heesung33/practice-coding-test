import java.util.Arrays;
import java.util.Scanner;

public class Main9063Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] resultx = new int[n];
        int[] resulty= new int[n];
        for (int i = 0; i < n; i++) {
            resultx[i] = sc.nextInt();
            resulty[i] = sc.nextInt();
        }
        Arrays.sort(resultx);
        Arrays.sort(resulty);
        System.out.println((resultx[n-1] - resultx[0]) * (resulty[n-1] - resulty[0]));

    }
}
