import java.util.Arrays;
import java.util.Scanner;

public class Main2587Baekjoon {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            int  a=  sc.nextInt();
            temp += a;
            arr[i] = a;
        }
        Arrays.sort(arr);
        System.out.println(temp/5);
        System.out.print(arr[2]);
    }
}
