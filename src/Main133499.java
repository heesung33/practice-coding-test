import java.util.Scanner;

public class Main133499 {
    public static void main(String[] args) {
        Solution solutionInstance = new Solution();

        String[] inputArray = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int result = solutionInstance.solution(inputArray);

        System.out.println("Answer: " + result);
    }
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;

            for(String s : babbling){
                s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
                s = s.replaceAll("aya|ye|woo|ma", "");
                if(s.equals("")){
                    answer++;
                }
            }

            return answer;
        }
    }
}
