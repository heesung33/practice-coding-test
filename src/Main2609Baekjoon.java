import java.util.Scanner;

public class Main2609Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B =sc.nextInt();
        int result = 0;
        int max = Math.max(A, B);
        for(int i = 1; i<max + 1; i++) {
            if(A % i == 0 && B % i == 0) {
                result =i;
            }
        }
        int max1 = result;
        while(true) {
            if(result % A == 0 && result % B == 0) {
                break;
            } else {
                result +=max1;
            }
        }
        System.out.println(max1);
        System.out.println(result);
    }
}
