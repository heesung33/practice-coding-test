import java.util.Scanner;

public class Main5597Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        for (int i = 1; i <= 28; i++) {
            int m = sc.nextInt();
            arr[m] = m;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
