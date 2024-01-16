import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1002Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st2.nextToken());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double cal_pow = cal(x1, x2, y2, y1);
            if(x1 == x2 && y2 == y1 && r1 == r2) { // 원이 또같아 접점이 무한대일 때
                System.out.println(-1);
            } else if (cal_pow > Math.pow(r2 + r1, 2)) { // 원 안에 원이 없고 외접하지도 않을 때
                System.out.println(0);
            } else if (cal_pow < Math.pow(r2 - r1, 2)) { // 원 안에 원이 있고 내접하지 않을 때
                System.out.println(0);
            } else if (cal_pow == Math.pow(r2 - r1, 2) ) { // 원 안에 원이 있고 내접할 때
                System.out.println(1);
            } else if (cal_pow == Math.pow(r2 + r1, 2)) { // 원이 서로 외접할 때
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }

    public static double cal(int x1, int x2, int y2, int y1) {
        return Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    }
}
