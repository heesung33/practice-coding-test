import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2562Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            integerList.add(sc.nextInt());
        }
        int temp = 0;
        int result = 0;
        for (int k = 0; k < integerList.size(); k++) {
            if (temp < integerList.get(k)) {
                temp = integerList.get(k);
                result = k + 1;
            }
        }
        System.out.println(temp);
        System.out.println(result);
    }
}
