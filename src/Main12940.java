public class Main12940 {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int up = n;
        int down = m;
        int temp = 1;
        int[] answer = new int[2];
        if (n < m) {
            up = m;
            down = n;
        }
        while (up % down != 0) {
            temp = up % down;
            if (temp != 0) {
                up = down;
                down = temp;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            if (i == 0) {
                answer[i] = down;
            } else {
                answer[i] = (n * m) / down;
            }
        }
        for (int j : answer) {
            System.out.println(j);
        }
    }
}
