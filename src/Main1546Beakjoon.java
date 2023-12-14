import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1546Beakjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(sc.nextDouble());
        }
        double tmep = 0;
        for (int j = 0; j < integers.size(); j++) {
            if (tmep < integers.get(j)) {
                tmep = integers.get(j);
            }
        }
        double result = 0;
        for (Double integer : integers) {
            result += integer / tmep * 100;
        }
        System.out.print(result / n);
    }
}
