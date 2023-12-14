import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10952Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            integerList.add(a + b);
        }
        for(int j : integerList) {
            System.out.println(j);
        }
    }
}
