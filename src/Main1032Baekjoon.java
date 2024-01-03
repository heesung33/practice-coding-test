import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1032Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        int max = list.get(0).length() - 1;
        int temp = 0;
        while (true) {
            String s = list.get(0);
            char t = s.charAt(temp);
            boolean ty = false;
            for (int i = 0; i < list.size(); i++) {
                String string = list.get(i);
                char y = string.charAt(temp);
                if (t != y) {
                    System.out.print("?");
                    ty = true;
                    break;
                }
            }
            if(!ty) {
                System.out.print(t);
            }
            if (max == temp) {
                break;
            }
            temp += 1;
        }

    }
}
