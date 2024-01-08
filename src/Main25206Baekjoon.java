import java.util.Scanner;

public class Main25206Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = 0.0;
        double temp2 = 0.0;
        for (int i = 0; i < 20; i++) {
            String s = sc.next();
            double d = sc.nextDouble();
            String S = sc.next();
            if(!S.equals("P")) {
                double cal;
                 switch (S) {
                     case "A+":
                         cal = 4.5;
                         break;
                     case "A0":
                         cal = 4.0;
                         break;
                     case "B+":
                         cal = 3.5;
                         break;
                     case "B0":
                         cal = 3.0;
                         break;
                     case "C+":
                         cal = 2.5;
                         break;
                     case "D+":
                         cal = 1.5;
                         break;
                     case "D0":
                         cal = 1.0;
                         break;
                     case "F":
                         cal = 0.0;
                         break;
                     case "C0":
                         cal = 2.0;
                         break;
                     default:
                         cal = 0;
                         break;
                };
                temp += d * cal;
                temp2 += d;
            }
        }
        System.out.printf("%.6f", temp/temp2);
    }
}
