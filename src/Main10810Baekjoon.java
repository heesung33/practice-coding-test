import java.util.Scanner;

public class Main10810Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];
        for (int s = 0; s < b; s++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int I = i - 1; I < j; I++) {
                arr[I] = k;
            }

        }
        for(int r = 0; r < arr.length; r++) {
            System.out.print(arr[r] + " ");
        }
    }
}
