import java.util.Arrays;
import java.util.Scanner;

public class Main2693Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] intArrays = new int[10];
            for(int y = 0; y < 10; y++) {
                intArrays[y] = sc.nextInt();
            }

            Arrays.sort(intArrays);
            sb.append(intArrays[7]).append(" ");
        }
        System.out.print(sb);;
    }
}
