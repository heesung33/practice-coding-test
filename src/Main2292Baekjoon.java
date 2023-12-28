import java.util.Scanner;

public class Main2292Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int temp = 1;
        while (true) {
            if (n == 1) {
                break;
            }
            if (n <= i) {
                break;
            } else {
                i +=  6 * temp;
                temp +=1;
            }
        }
        System.out.print(temp);
    }
}
