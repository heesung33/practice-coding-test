public class Main77884 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int temp =0;
        int answer = 0;
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    temp ++;
                }
            }
            if(temp%2==0) {
                answer += i;
            } else {
                answer += i*-1;
            }
            temp = 0;
        }
        System.out.println(answer);
    }
}
