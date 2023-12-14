import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10871Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(sc.nextInt());
        }
        for (int i = 0; i < integers.size(); i++) {
            if( b > integers.get(i)) {
                System.out.print(integers.get(i));
                System.out.print(" ");
            }
        }
    }
}
