import java.util.Scanner;

public class Main25314Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("long ");
        }
        System.out.print(sb + "int");
    }
}
