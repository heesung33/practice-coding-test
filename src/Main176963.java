public class Main176963 {
    public static void main(String[] args) {
        Solution solutionInstance = new Solution();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        int[] result = solutionInstance.solution(name, yearning, photo);
        for (int i = 0; i < result.length; i++) {
            System.out.println("answer: " + result[i]);
        }
    }

    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            for (int i = 0; i < photo.length; i++) {
                for (int j = 0; j < photo[i].length; j++) {
                    for (int y = 0; y < name.length; y++) {
                        if (photo[i][j].equals(name[y])) {
                            answer[i] += yearning[y];
                        }
                    }
                }
            }
            return answer;
        }
    }
}
