import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4344Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> dList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int people = sc.nextInt();
            double[] arr = new double[people];
            double num = 0;
            double num1 = 0;
            for (int j = 0; j < people; j++) {
                int sum = sc.nextInt();
                arr[j] = sum;
                num += sum;
            }
            double cal = num / people;
            for (double v : arr) {
                if (v > cal) {
                    num1++;
                }
            }
            dList.add( 100 * (num1 / people));
        }
        for(double j : dList) {
            System.out.printf("%.3f", j);
            System.out.println("%");
        }
    }
}
