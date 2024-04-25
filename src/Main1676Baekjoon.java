import java.util.Scanner;

public class Main1676Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        for(int i = 2; i <=n; i++) {
            temp= temp * i;
        }
        
    }
}
