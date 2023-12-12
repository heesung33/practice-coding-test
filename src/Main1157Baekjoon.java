import java.util.Scanner;

public class Main1157Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ty = false;
        char result = 0;
        boolean tf1 = false;
        String n = sc.next();
        n = n.toUpperCase();
        int temp2 =0;
        if(n.length() == 1) {
            result = n.charAt(0);
        } else {
            for(int i = 0; i < n.length(); i++) {
                int temp = 0;
                char s = n.charAt(i);
                tf1 = false;
                for(int j = 0; j < n.length(); j++) {
                    if(i!=j) {
                        if(s == n.charAt(j)) {
                            temp++;
                            tf1 = true;
                        }
                    }
                }
                if(temp == temp2 && tf1) {
                    ty = false;
                }
                if(temp2 < temp) {
                    temp2 = temp;
                    result = n.charAt(i);
                    ty = true;
                }
                if(tf1) {
                    n = n.replace(String.valueOf(n.charAt(i)), "");
                }
            }
        }
        if(!tf1 && n.length()!=1||(!ty && n.length()!=1)) {
            result = '?';
        }
        System.out.print(result);
    }
}
