import java.util.*;

public class MainProGrammers64065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i : solution(s)) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(String s) {
        Set<Integer> set = new HashSet<>();
        String newS = s.replaceAll("\\{", "");
        newS = newS.replaceAll("}", "");
        newS = newS.replaceAll(",", " ");
        StringTokenizer st = new StringTokenizer(newS);
        while (true) {
            try{
                set.add(Integer.valueOf(st.nextToken()));
            } catch (Exception e) {
                break;
            }
        }
        int[] answer = new int[set.size()];
        int v = s.length();
        for (int i : set) {
            String filterS = s.replaceAll(String.valueOf(i), "");
            int count = v - filterS.length();
            int result = count / String.valueOf(i).length();
            answer[set.size() - result] = i;
        }
        return answer;
    }
}
