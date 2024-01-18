import java.util.Arrays;
import java.util.Scanner;

public class Main2309Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            count += arr[i];
        }
        Arrays.sort(arr);
        int fake = 0;
        int fake2 = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(i != j) {
                    if(count - arr[i] - arr[j] == 100) {
                        fake = arr[i];
                        fake2 = arr[j];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if(arr[i] != fake2 && arr[i] != fake) {
                System.out.println(arr[i]);
            }
        }
    }
}
