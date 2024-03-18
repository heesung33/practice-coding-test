import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15649Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        int[] output = new int[arr.length];
        boolean[] visited = new boolean[arr.length];
        per(arr, output, visited, 0, M);

    }
    private static void per(int[] arr, int[] output, boolean[] visited, int depth, int r) {
        if(depth == r) {
            for(int i = 0; i < r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                per(arr, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }

    }
}
