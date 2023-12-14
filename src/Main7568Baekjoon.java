import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7568Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            xList.add(sc.nextInt());
            yList.add(sc.nextInt());
        }
        for (int i = 0; i < xList.size(); i++) {
            int x = xList.get(i);
            int y = yList.get(i);
            int k = 1;
            for (int j = 0; j < yList.size(); j++) {
                if (yList.get(j) > y && xList.get(j) > x) {
                    k +=1;
                }
            }
            resultList.add(k);
        }
        for(int i : resultList) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
