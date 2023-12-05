public class Main12922 {
    public static void main(String[] args) {
        int n = 3;
        String answer = "";
        if(n % 2 ==0) {
            for(int i = 0; i<n/2; i++) {
                String wm = "수박";
                answer = answer.concat(wm);
            }
        } else {
            for(int i = 0; i<n/2; i++) {
                String wm = "수박";
                answer = answer.concat(wm);
            }
            answer = answer.concat("수");
        }
        System.out.println(answer);
    }
}
