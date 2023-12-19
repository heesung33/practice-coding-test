import java.util.*;

public class Main1764Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int b = sc.nextInt();
        String[] sList = new String[d + b];
        for (int i = 0; i < d + b; i++) {
            sList[i] = sc.next();
        }
        Arrays.sort(sList);
        int temp = 0;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < sList.length; i++) {
            if (i != (sList.length - 1) && (sList[i].equals(sList[i + 1]))) {
                temp++;
                stringList.add(sList[i]);
            }
        }
        System.out.println(temp);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
