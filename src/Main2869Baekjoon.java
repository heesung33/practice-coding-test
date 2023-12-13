import java.util.Scanner;

public class Main2869Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int result = 0;
        result = (V - B - 1) / (A - B) + 1;
        System.out.println(result);
    }
}
