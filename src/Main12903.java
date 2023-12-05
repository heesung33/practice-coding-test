public class Main12903 {
    public static void main(String[] args) {
        String answer = "";
        String s = "abcdeeee";
        int cal = 0;
        if (s.length() % 2 == 0) {
            cal = s.length() / 2;
            answer = s.substring(cal-1, cal + 1);
        } else {
            cal = s.length() / 2;
            answer = s.substring(cal, s.length() - cal);
        }
        System.out.println(answer);
    }
}
