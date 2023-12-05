public class Main12930 {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";
        char[] chars = new char[]{};
        chars = s.toCharArray();
        int y = 0;
        for(int i = 0; i<chars.length; i++) {

            if(y%2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            answer = answer.concat(String.valueOf(chars[i]));
            y++;
            if(String.valueOf(chars[i]).equals(" ")) {
                y = 0;
            }
        }
        System.out.println(answer);
    }
}
