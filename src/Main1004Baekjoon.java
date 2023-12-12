import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1004Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스의 개수
        sc.nextLine();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String startEnd = sc.nextLine();
            int x_start = Integer.parseInt(startEnd.split(" ")[0]);
            int y_start = Integer.parseInt(startEnd.split(" ")[1]);
            int x_end = Integer.parseInt(startEnd.split(" ")[2]);
            int y_end = Integer.parseInt(startEnd.split(" ")[3]);
            int temp = 0;

            int h = sc.nextInt(); // 행성의 개수
            sc.nextLine();
            for(int j = 0; j < h; j++) {
                String hangseong = sc.nextLine();
                int x = Integer.parseInt(hangseong.split(" ")[0]);
                int y = Integer.parseInt(hangseong.split(" ")[1]);
                int r = Integer.parseInt(hangseong.split(" ")[2]);

                boolean startPoint = false;
                boolean endPoint = false;
                if(Math.pow(x_start - x, 2) + Math.pow(y_start - y, 2) < Math.pow(r, 2)) {
                 startPoint = true;
                }
                if(Math.pow(x_end - x, 2) + Math.pow(y_end - y, 2) < Math.pow(r, 2)) {
                    endPoint = true;
                }
                if(!(endPoint && startPoint) && (endPoint || startPoint)) {
                    temp++;
                }
            }
            result.add(temp);
        }
        for(int j : result) {
            System.out.println(j);
        }
        sc.close();
    }
}
