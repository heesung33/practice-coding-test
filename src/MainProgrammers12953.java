import java.util.Arrays;

public class MainProgrammers12953 {
    static int[] arr;
    public static void main(String[] args) {
        arr = new int[] {2,6,8,14};
        System.out.print(solution(arr));
    }
    public static int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        answer = arr[arr.length -1];
        while (true) {
            boolean ty = false;
            for(int i = 0; i < arr.length; i++) {
                if(answer % arr[i] != 0) {
                    ty =true;
                    break;
                }
            }
            if(!ty) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
