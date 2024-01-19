import java.util.Scanner;

public class Main11721Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = " ".concat(sc.next());
        for(int i=1; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if(i %10 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
}
