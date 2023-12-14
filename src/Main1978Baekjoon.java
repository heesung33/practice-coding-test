import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1978Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            for(int j = 2; j <= list.get(i); j++) {
                if(list.get(i) % j == 0) {
                    temp = j;
                    break;
                }
            }
            if(temp == list.get(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
