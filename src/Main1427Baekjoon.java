import java.util.Arrays;
import java.util.Scanner;

public class Main1427Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Character[] sList = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sList[i] = s.charAt(i);
        }
        Arrays.sort(sList);
        for(int i = sList.length - 1; i >=0; i--) {
            System.out.print(sList[i]);
        }
    }
}
