import java.util.Arrays;

public class Main12917 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";
        char temp = 0;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for(int i =0; i<chars.length/2; i++) {
            temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1 -i] = temp;
        }
        s = new String(chars);

        answer = s;

        System.out.println(answer);
    }
}
