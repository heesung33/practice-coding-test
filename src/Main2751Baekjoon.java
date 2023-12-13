import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2751Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long n = sc.nextLong();
        List<Long> stringList = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            stringList.add(sc.nextLong());
        }
        Collections.sort(stringList);
        for(Long value : stringList) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
