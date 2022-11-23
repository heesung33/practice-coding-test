import java.util.Scanner;

public class Main1890 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] A = new int[101][101];
        long[][] D = new long[N+1][N+1];


        D[0][0] = 1;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(i ==0 && j ==0) continue;
                for(int k = 0; k< j; k++) {
                    if(k + A[i][k] == j) {
                        D[i][j] += D[i][k];
                    }
                }

                for(int k = 0; k<i; k++) {
                    if(k+A[k][j] == i) {
                        D[i][j] += D[k][j];
                    }
                }
            }
        }

        System.out.println(D[N - 1][N - 1]);

    }
}
