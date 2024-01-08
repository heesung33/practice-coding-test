import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1316Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Set<String> set = new HashSet<>();
            boolean ty = false;
            for (int j = 0; j < s.length(); j++) {
                if (set.contains(String.valueOf(s.charAt(j)))) {
                    ty = true;
                    break;
                }
                if (j != s.length() - 1 && s.charAt(j + 1) != s.charAt(j)) {
                    set.add(String.valueOf(s.charAt(j)));
                }
            }
            if (!ty) {
                count++;
            }
        }
        System.out.println(count);
    }
}
