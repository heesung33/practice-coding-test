import java.util.ArrayList;
import java.util.Collections;

public class Main12910 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 36, 1, 3};
        ArrayList<Integer> answerList = new ArrayList<>();
        int divisor = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answerList.add(arr[i]);
            }
        }
        if (answerList.size() == 0) {
            answerList.add(-1);
        }
        Collections.sort(answerList);
        // ArrayList를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        // 결과 출력
        for (int i = 0; i < answer.length; i++) {
            System.out.println("answer[" + i + "]: " + answer[i]);
        }
        // 나중에 오름차순 정렬도 해야함.
    }
}
