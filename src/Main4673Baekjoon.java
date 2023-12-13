import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4673Baekjoon {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for(int i = 1; i<=10000; i++) {
            int temp = 0;
            temp += i;
            String s = String.valueOf(i);
            for(int j = 0; j < s.length(); j++) {
                temp +=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            integerList.add(temp);
        }
        loop :
        for(int i = 1; i<=10000; i++) {
            for(int j : integerList) {
                if(j == i) {
                    continue loop;
                }
            }
            System.out.println(i);
        }
    }
}
