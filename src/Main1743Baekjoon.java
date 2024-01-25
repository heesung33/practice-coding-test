import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1743Baekjoon {
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};

    static int[] dy = {0, 0, 1, -1};
    static int n;
    static int m;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        visited = new boolean[n][m];
        map = new int[n][m];
        list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a - 1][b - 1] = 1;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                if(visited[i][j] || map[i][j] == 0) {
                    continue;
                }
                bfs(i, j);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list.get(0));
    }

    public static void bfs(int x, int y) {
        int count = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(nextX < 0 || nextY < 0 || nextX>=n || nextY >=m) {
                    continue;
                }
                if(visited[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }
                count++;
                q.add(new int[] { nextX, nextY});
                visited[nextX][nextY] = true;

            }
        }
        list.add(count);
    }
}
