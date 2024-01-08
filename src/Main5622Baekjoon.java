import java.util.Scanner;

public class Main5622Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int cal = 0;
        int temp = 0;
        for (int i = 0; i < A.length(); i++) {
            cal = Integer.valueOf(A.charAt(i)) - 64;
            if (cal >= 1 && cal <= 3) { // ABC
                temp += 3;
            } else if (cal >= 4 && cal <= 6) { // DEF
                temp += 4;
            } else if (cal >= 7 && cal <= 9) { // GHI
                temp += 5;
            } else if (cal >= 10 && cal <= 12) { // JKL
                temp += 6;
            } else if (cal >= 13 && cal <= 15) { // MNO
                temp += 7;
            } else if (cal >= 16 && cal <= 19) { // PQRS
                temp += 8;
            } else if (cal >= 20 && cal <= 22) { // TUV
                temp += 9;
            } else if (cal >= 23 && cal <= 26) { // WXYZ
                temp += 10;
            }
        }
        System.out.print(temp);
    }
}
