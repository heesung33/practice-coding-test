import java.util.Scanner;

public class Main2581Baekjoon {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] arr = new boolean[N+1];
        arr[1] = true;
        for(int i = 2; i<=N; i++) {
            if(arr[i]){
                continue;
            }
            for(int j = i+i; j<=N; j = j+i){
                arr[j] = true;
            }
        }
        long temp = 0;
        for(int i = M; i <=N; i++) {
            if(!arr[i]) {
                temp += i;
            }
        }
        if(temp != 0) {
            System.out.println(temp);
        }
        int result = -1;
        for(int i = M; i <=N; i++) {
            if(!arr[i]) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}
