import java.util.Scanner;

public class Main1110Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp = "0";
        int answer = 0;
        if (s.length() == 1) {
            temp = temp.concat(s);
            s = temp;
        }
        String rseult1 = s;
        String result = "";
        String right = "";
        while (!rseult1.equals(result)) {
            right = String.valueOf(s.charAt(1));
            s = String.valueOf(Integer.parseInt(String.valueOf(s.charAt(0))) + Integer.parseInt(right));
            temp = "0";
            if (s.length() == 1) {
                temp = temp.concat(s);
                s = temp;
            }
            s = right.concat(String.valueOf(s.charAt(1)));

            temp = "0";
            if (s.length() == 1) {
                temp = temp.concat(s);
                s = temp;
            }
            result = s;
            answer++;
        }
        System.out.println(answer);
    }

}
