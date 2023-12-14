import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8958Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> Int = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int temp = 0;
            int result = 0;
            for (int j = 0; j < s.length(); j++) {
                if(String.valueOf(s.charAt(j)).equals("O")){
                    temp +=1;
                    result += temp;
                } else {
                    temp = 0;
                }
            }
            Int.add(result);
        }
        for(int j : Int) {
            System.out.println(j);
        }
    }
}
