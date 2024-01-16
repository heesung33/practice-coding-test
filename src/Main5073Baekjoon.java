import java.util.Arrays;
import java.util.Scanner;

public class Main5073Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            int[] result = new int[3];
            result[0] = a;
            result[1] = b;
            result[2] = c;
            Arrays.sort(result);
            if(result[0] + result[1] <= result[2]) {
                System.out.println("Invalid");
            } else if (result[0] == result[1] && result[0] == result[2] && result[1] == result[2]) {
                System.out.println("Equilateral");
            } else if(result[0] == result[1] || result[0] == result[2] || result[1] == result[2]) {
                System.out.println("Isosceles");
            } else if (result[0] != result[1] && result[0] != result[2] && result[1] != result[2]) {
                System.out.println("Scalene");
            }
        }
    }
}
