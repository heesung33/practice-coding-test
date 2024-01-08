import java.util.Scanner;

public class Main10813Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[m+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int temp = arr[I];
            arr[I] = arr[J];
            arr[J] = temp;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
