public class Main86491 {
    public static void main(String[] args) {
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = 0;
        int temp = 0;
        int garo = 0;
        int sero = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (garo < sizes[i][0]) {
                garo = sizes[i][0];
            }
            if (sero < sizes[i][1]) {
                sero = sizes[i][1];
            }
        }
        answer = garo * sero;
        System.out.println(answer);

    }
}
