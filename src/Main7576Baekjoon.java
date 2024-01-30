import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7576Baekjoon {
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};

    static int[] dy = {0, 0, 1, -1};
    static int n;
    static int m;
    static int[][] distance;
    static int result;
    static Queue<int[]> q = new LinkedList<>();
    static int minus;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    q.add(new int[]{i, j});
                    count++;
                    visited[i][j] = true;
                    distance[i][j] = 0;
                }
                if(map[i][j] == -1) {
                    minus++;
                }
            }
        }
        bfs();
        System.out.print(result);
    }

    public static void bfs() {

        while (!q.isEmpty()) {

            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            map[nowX][nowY] = count;
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                if (visited[nextX][nextY] || map[nextX][nextY] == -1) {
                    continue;
                }
                count++;
                q.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
                distance[nextX][nextY] = distance[nowX][nowY] + 1;
                result = distance[nextX][nextY];
            }
        }
        if (count != (n * m) - minus) {
            result = -1;
        }
    }
}
