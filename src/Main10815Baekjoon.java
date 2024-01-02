import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main10815Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        Set<Integer> mSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            mSet.add(sc.nextInt());
        }

        int n = sc.nextInt();
        int[] nList = new int[n];
        for (int i = 0; i < n; i++) {
            nList[i] = sc.nextInt();
        }
        // set 으로 하면 log( M + N) list 로 할 시 log(M * N)
        for (int a : nList) {
            if (mSet.contains(a)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
