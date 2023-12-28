import java.util.Scanner;

public class Main9655Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2== 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }
}
