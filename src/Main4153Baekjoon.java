import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4153Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if ((a * a) + (b * b) == c * c) {
                list.add("right");
            } else if ((c * c) + (b * b) == a * a) {
                list.add("right");
            } else if ((c * c) + (a * a) == b * b) {
                list.add("right");
            } else {
                list.add("wrong");
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
