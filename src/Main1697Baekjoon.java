import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1697Baekjoon {
    static int[] visited;
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new int[100001];
        System.out.print(bfs(N));
    }

    private static int bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        visited[x] = 0;
        q.add(x);
        while (!q.isEmpty()) {
            int n = q.poll();
            if(n == K) {
                return visited[n];
            }
            if (n - 1 >= 0 && visited[n - 1] == 0) {
                q.add(n - 1);
                visited[n - 1] = visited[n] + 1;
            }
            if (n + 1 <= 100000 && visited[n + 1] == 0) {
                q.add(n + 1);
                visited[n + 1] = visited[n] + 1;
            }
            if (n * 2 <= 100000 && visited[n * 2] == 0) {
                q.add(n * 2);
                visited[n * 2] = visited[n] + 1;
            }
        }
        return -1;
    }
}
