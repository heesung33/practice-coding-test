import java.util.Scanner;

public class Main10811Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            while (true) {
                if(I != J) {
                    int temp = arr[I];
                    arr[I] = arr[J];
                    arr[J] = temp;
                    I++;
                    if(I == J) {
                        break;
                    }
                    J--;
                } else {
                    break;
                }
            }
        }
        for(int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
