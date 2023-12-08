
public class Main42842 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow  = 24;
        int garo = 0;
        int sero = 0;
        int[] answer = new int[]{};
        for(int i = yellow; i >=1; i--) {
            for(int j = 1; j<=yellow; j++) {
                if(i * j ==yellow) {
                    garo = i;
                    sero = j;
                    break;
                } else if ( i* j > yellow) {
                    break;
                }
            }
            if(brown == ((garo + 2) * 2) + (sero * 2)) {
                answer = new int[]{garo+2, sero+2};
                break;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
