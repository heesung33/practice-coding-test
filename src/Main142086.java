public class Main142086 {
    public static void main(String[] args) {
        String s = "foobar";
        char[] chars = new char[]{};
        chars = s.toCharArray();
        int[] answer = new int[chars.length];
        for (int i = 1; i < chars.length; i++) {
            int temp  = 0;
            for (int j = 0; j < i; j++) {
                if(chars[i] == chars[j]) {
                    temp = j;
                } else {
                    answer[i] = -1;
                }
            }
            if(chars[i] == chars[temp]) {
                answer[i] = i - temp;
            }
        }
        answer[0] = -1;
        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
}
