import java.util.Arrays;
import java.util.Scanner;

public class Main11651Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for(int i = 0; i<n;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (num1, num2) -> {
            if(num1[1] == num2[1]) {
                return num1[0] - num2[0];
            } else {
                return num1[1] - num2[1];
            }
        });
        for (int[] ints : arr) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
