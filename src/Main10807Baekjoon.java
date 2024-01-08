import java.util.Scanner;

public class Main10807Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int cal = sc.nextInt();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cal) {
                result++;
            }
        }
        System.out.print(result);
    }
}
