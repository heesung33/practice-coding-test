public class Main12924 {
    public static void main(String[] args) {
        int n = 15;
        int answer = 1;

        for(int i = 1; i<=n; i ++) {
            int sum = i;
            for(int j = i + 1; j<=n; j++) {
                sum += j;
                if(sum == n) {
                    answer +=1;
                    break;
                } else if(sum > n){
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
