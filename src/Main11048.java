import java.util.Scanner;

public class Main11048 {

    static int[][] A = new int[1001][1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] d = new int[N+1][M+1];

        int max;

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++)
        {
            for(int j = 1; j <= M; j++)
            {
                max = Math.max(Math.max(d[i-1][j], d[i][j-1]), d[i-1][j-1]);

                d[i][j] = max + A[i][j];
            }
        }

        System.out.println(d[N][M]);



    }
}
