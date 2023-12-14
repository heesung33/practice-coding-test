import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2675Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();
            String s = "";
            for (int j = 0; j < b.length(); j++) {
                for(int y=0; y<a; y++) {
                    s = s.concat(String.valueOf(b.charAt(j)));
                }
            }
            stringList.add(s);
        }
        for(String j : stringList) {
            System.out.println(j);
        }
    }
}
