import java.util.Scanner;

public class Main2231Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        loop:
        for(int i = 1; i<=n; i++) {
            String s = String.valueOf(n-i);
            int cal = Integer.valueOf(s);
            for(int j = 0; j < s.length(); j++) {
                if(String.valueOf(s.charAt(j)).equals("0")) {
                    continue loop;
                }
                cal +=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            if(cal == n) {
                result = Integer.parseInt(s);
                break;
            }
        }
        System.out.print(result);
    }
}
