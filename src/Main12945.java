import java.util.Scanner;

public class Main12945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<=n; i++) {
            arr[i] = (arr[i -1] + arr[i - 2]) % 1234567;
        }
        int answer = arr[n];
        System.out.println(answer);

    }
}
