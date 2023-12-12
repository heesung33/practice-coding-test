import java.util.Scanner;

public class Main2908Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String temp = "";
        String temp2 = "";
        for(int i = a.length() -1; i>=0; i--) {
            temp = temp.concat(String.valueOf(a.charAt(i)));
        }
        for(int i = b.length() -1; i>=0; i--) {
            temp2 = temp2.concat(String.valueOf(b.charAt(i)));
        }

        System.out.printf("%s", Integer.parseInt(temp2) > Integer.parseInt(temp) ? temp2 : temp);;
    }
}
