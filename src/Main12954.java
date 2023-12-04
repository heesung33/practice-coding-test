public class Main12954 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        int temp = 1;
        long[] answer = new long[n];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = (long) x * temp;
            temp++;
            System.out.println(answer[i]);
        }
    }
}
