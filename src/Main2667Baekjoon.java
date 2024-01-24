import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2667Baekjoon {
    static int n;
    static boolean[][] visited;
    static int[][] map;

    static int[] dx = {-1, 1, 0, 0};

    static int[] dy = {0, 0, 1, -1};
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        visited = new boolean[n][n];
        map = new int[n][n];
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || map[i][j] == 0) {
                    continue;
                }
                bfs(i, j);
                count++;
            }
        }
        System.out.println(count);
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static void bfs(int x, int y) {
        int count = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        int nowX = 0;
        int nowY = 0;
        while (!q.isEmpty()) {
            int now[] = q.poll();
            nowX = now[0];
            nowY = now[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }
                if (visited[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }
                count++;
                map[nextX][nextY] = count;
                q.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
            }
        }
        list.add(map[nowX][nowY]);
    }
}
