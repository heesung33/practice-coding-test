import java.util.Scanner;

public class Main147355 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        String t = sc.next();

        String p = sc.next();

        int result = 0;
        int i = 0;
        for (i = 0; i <= t.length() - p.length(); i++) {
            int cal = p.length() + i;
            String temp = t.substring(i, cal);
            if(Long.parseLong(p) >=Long.parseLong(temp)) {
                result += 1;
            }
        }
        System.out.println(result);
    }

}