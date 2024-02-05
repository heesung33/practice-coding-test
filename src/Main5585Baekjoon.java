import java.util.Scanner;

public class Main5585Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1000 - n;
        int result = 0;
        result += count / 500;
        count -= (count / 500) * 500;
        result += count / 100;
        count -= (count / 100) * 100;
        result += count / 50;
        count -= (count / 50) * 50;
        result += count / 10;
        count -= (count / 10) * 10;
        result += count / 5;
        count -= (count / 5) * 5;
        result += count / 1;
        count -= (count / 1) * 1;
        System.out.print(result);
    }
}
