import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1920Baekjoon {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        for (int i = 0; i < A.length; i++) {
//            A[i] = sc.nextInt();
//        }
//        int M = sc.nextInt();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < M; i++) {
//            int n = sc.nextInt();
//            int a = Arrays.stream(A).filter(ab -> {
//                return ab == n;
//            }).sum();
//
//            if (a != 0) {
//                sb.append(1).append("\n");
//            } else  {
//                sb.append(0).append("\n");
//            }
//        }
//        System.out.println(sb);
//
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    Set<Integer> setA = new HashSet<>(); // set을 활용한 효율성 높이기

    for (int i = 0; i < A.length; i++) {
        A[i] = sc.nextInt();
        setA.add(A[i]);
    }

    int M = sc.nextInt();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < M; i++) {
        int n = sc.nextInt();

        if (setA.contains(n)) { // filter sum 보다 배열크기가 클 때 효율이 더 좋음.
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    System.out.println(sb);
}
}
