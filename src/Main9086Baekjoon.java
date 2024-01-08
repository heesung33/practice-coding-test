import java.util.Scanner;

public class Main9086Baekjoon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            String n = sc.next();
            sb.append(n.charAt(0)).append(n.charAt(n.length()-1)).append("\n");
        }
        System.out.print(sb);
    }
}
