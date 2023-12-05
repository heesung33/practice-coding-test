public class Main12918 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "1234";
        int a = 0;
        int b = 0;
        a = s.length();
        s = s.replaceAll("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQSTUVWXYZ]", "");
        b = s.length();
        if ((s.length() != 4 && s.length() != 6) || a != b) answer = false;
        System.out.println(answer);
    }
}
