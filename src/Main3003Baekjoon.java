import java.util.Scanner;

public class Main3003Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bs = sc.nextInt();
        int nite = sc.nextInt();
        int phone = sc.nextInt();
        sb.append(1 - king).append(" ");
        sb.append(1 - queen).append(" ");
        sb.append(2 - look).append(" ");
        sb.append(2 - bs).append(" ");
        sb.append(2 - nite).append(" ");
        sb.append(8 - phone).append(" ");
        System.out.print(sb);
    }
}
