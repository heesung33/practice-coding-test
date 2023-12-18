import java.util.Scanner;

public class Main1094Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = 64;
        int cal = 0;
        int result = 0;
        while (true) {
            if (64 == x || 32 == x) {
                result=1;
                break;
            } else if (cal == x){
                break;
            }else {
                if (temp > x) {
                    while (true) {
                        temp = temp / 2;
                        cal += temp;
                        result++;
                        if (cal > x) {
                            cal -= temp;
                            result--;
                        }
                        if(cal == x) {
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
