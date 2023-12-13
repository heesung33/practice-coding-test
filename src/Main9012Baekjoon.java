import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9012Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            List<String> stringList = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                stringList.add(String.valueOf(s.charAt(j)));
            }
            int y = 0;
            while (true) {
                if (stringList.size() % 2 != 0) {
                    break;
                } else if (y + 1 == stringList.size()) {
                    break;
                } else {
                    if (!stringList.get(y).equals(stringList.get(y + 1)) && stringList.get(y).equals("(")) {
                        stringList.remove(y);
                        stringList.remove(y);
                        y = 0;
                        if (stringList.size() == 0) {
                            break;
                        }
                    } else if (stringList.size() == 2 && stringList.get(y).equals(stringList.get(y + 1))) {
                        break;
                    } else {
                        y += 1;
                    }
                }
            }
            if (stringList.size() == 0) {
                resultList.add("YES");
            } else {
                resultList.add("NO");
            }
        }
        for (String j : resultList) {
            System.out.println(j);
        }
    }
}