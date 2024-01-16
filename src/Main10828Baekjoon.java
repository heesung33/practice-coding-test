import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10828Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int size = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push")) {
                list.add(sc.nextInt());
                size++;
            } else if (s.equals("pop")) {
                if(list.size() == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(list.get(list.size()-1)).append("\n");
                    list.remove(list.size()-1);
                    size--;
                }
            } else if (s.equals("size")) {
                sb.append(size).append("\n");
            } else if (s.equals("empty")) {
                int cal = 0;
                if(list.size() == 0) {
                    cal = 1;
                }
                sb.append(cal).append("\n");

            } else if (s.equals("top")) {
                int cal = -1;
                if (list.size() != 0) {
                    cal = list.get(list.size() - 1);
                }
                sb.append(cal).append("\n");

            }
        }
        System.out.print(sb);
    }
}
