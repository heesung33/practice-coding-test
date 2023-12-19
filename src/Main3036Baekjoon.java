import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3036Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> iList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            iList.add(sc.nextInt());
        }
        int temp = iList.get(0);
        int max = 0;
        for (int i = 1; i < iList.size(); i++) {
            int result = 1;
            while (true) {
                if (temp % result == 0 && iList.get(i) % result == 0) {
                    max = result;
                } else if (Math.max(temp, iList.get(i)) < result) {
                    break;
                }
                result++;
            }
            System.out.println(temp / max + "/" + iList.get(i) / max);
        }
    }
}
