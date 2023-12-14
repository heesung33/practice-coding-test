import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3052Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            n = n % 42;
            list.add(n);
        }
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp +=1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && i != j) {
                    list.remove(j);
                    j = 0;
                }
            }
        }
        System.out.println(temp);

    }
}
