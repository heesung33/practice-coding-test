import java.util.Scanner;

public class Main2444baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
