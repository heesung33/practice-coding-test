import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainProGrammers12909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }
        int i = 0;
        if (s.length() % 2 != 0 || String.valueOf(s.charAt(0)).equals(")")) {
            answer = false;
        } else {
            int count = 0;
            while (true) {
                sb.append(i);
                count++;
                q.poll();
                if (String.valueOf(s.charAt(i + 1)).equals(String.valueOf(sb.append(i)))) {
                    i++;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int j = 0; j < count; j++) {
                        char v = q.poll();
                        sb2.append(v);
                    }
                }
            }
        }
        return answer;
    }
}
