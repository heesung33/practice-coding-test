import java.util.ArrayList;
import java.util.List;

public class Main12939 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        char[] chars = new char[]{};
        chars = s.toCharArray();
        int max = -99999999;
        int min = 9999999;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            String c = "";
            while (!String.valueOf(chars[i]).equals(" ")) {
                c = c.concat(String.valueOf(chars[i]));
                i++;
                if (chars.length == i) {
                    break;
                }
            }
            stringList.add(c);
        }
        for (String j : stringList) {
            if (max < Integer.parseInt(j)) {
                max = Integer.parseInt(j);
            }
            if(min > Integer.parseInt(j)) {
                min = Integer.parseInt(j);
            }
        }
        String answer = min + " " + max;
        System.out.println(answer);

    }
}
