import java.util.Scanner;

public class Main2441Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = n-i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
