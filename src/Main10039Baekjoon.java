import java.util.Scanner;

public class Main10039Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if(n <=40) {
                temp += 40;
            } else {
                temp +=n;
            }
        }
        System.out.print(temp/5);
    }
}
