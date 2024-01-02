import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main11047Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        int temp = 0;
        for (int i : list) {
            if (money / i >= 1) {
                temp += money /i;
                money -= i * (money / i);
            }
        }
        System.out.println(temp);
    }
}
