import java.util.Scanner;

public class Main10101Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == 60 && b ==60 && c==60) {
            System.out.print("Equilateral");
        } else if (a + b + c == 180 && (a==b || a==c || b==c)) {
            System.out.print("Isosceles");
        } else if (a + b + c == 180 && (a!=b && a!=c && b!=c)) {
            System.out.print("Scalene");
        } else if (a + b + c != 180) {
            System.out.print("Error");
        }
    }
}
