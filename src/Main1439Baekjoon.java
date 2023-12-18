import java.util.Scanner;

public class Main1439Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int temp = 0;
        String start = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (!start.equals(String.valueOf(s.charAt(i)))) {
                temp++;
                String rb = String.valueOf(s.charAt(i));
                while (true) {
                    if(rb.equals(String.valueOf(s.charAt(i))) && i != s.length() -1) {
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
