import java.util.Scanner;

public class Main25304Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < b; i++) {
            int money = sc.nextInt();
            int cal = sc.nextInt();
            temp += money * cal;
        }
        if(n == temp) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
