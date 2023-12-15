import java.util.*;

public class Main1181Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        Set<String> set = new HashSet<>(list);
        List<String> newList = new ArrayList<>(set);
        String[] strings = new String[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            strings[i] = newList.get(i);
        }
        String tmep = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].length() < strings[j].length()) {
                    tmep = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmep;
                }
            }
        }
        List<String> sortList = new ArrayList<>();
        int temp = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 50; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (i == strings[j].length()) {
                    temp += 1;
                    sortList.add(strings[j]);
                }
            }
            Collections.sort(sortList);
            for (String y : sortList) {
                s = s.append(y).append("\n");
            }
            sortList.clear();
            if (temp == strings.length) {
                break;
            }
        }
        System.out.print(s);
    }
}
