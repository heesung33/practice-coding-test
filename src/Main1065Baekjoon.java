import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1065Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(cal(Integer.parseInt(bf.readLine())));
    }

    public static int cal(int num) {
        int cnt = 99;
        if (num < 100) {
            return num;
        } else {
            for (int i = 100; i <= num; i++) {
                int baek = i/100;
                int ship = (i/10) % 10;
                int ill = i % 10;
                if(baek - ship == ship - ill) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
