import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main10026baekjoon {
    static int n;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};

    static int[] dy = {0, 0, 1, -1};
    static int result = 0;
    static int result1 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (String.valueOf(s.charAt(j)).equals("R")) {
                    map[i][j] = 1;
                } else if (String.valueOf(s.charAt(j)).equals("G")) {
                    map[i][j] = 2;
                } else if (String.valueOf(s.charAt(j)).equals("B")) {
                    map[i][j] = 3;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j] && map[i][j] == 1) {
                    bfs(i, j, 1);
                    result++;
                }
                if(!visited[i][j] && map[i][j] == 2) {
                    bfs(i, j, 2);
                    result++;
                }
                if(!visited[i][j] && map[i][j] == 3) {
                    bfs(i, j, 3);
                    result++;
                }
            }
        }
        System.out.print(result + " ");
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j] && (map[i][j] == 1 || map[i][j] == 2)) {
                    bfs1(i, j, 1, 2);
                    result1++;
                }
                if(!visited[i][j] && map[i][j] == 3) {
                    bfs1(i, j, 3, 3);
                    result1++;
                }
            }
        }
        System.out.print(result1);
    }

    public static void bfs(int x, int y, int rgb) {
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
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }
                if(visited[nextX][nextY] || map[nextX][nextY] != rgb) {
                    continue;
                }
                q.add(new int[] {nextX, nextY});
                visited[nextX][nextY] = true;
            }
        }
    }
    public static void bfs1(int x, int y, int rgb, int rgb2) {
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
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }
                if(visited[nextX][nextY] || (map[nextX][nextY] != rgb && map[nextX][nextY] != rgb2)) {
                    continue;
                }
                q.add(new int[] {nextX, nextY});
                visited[nextX][nextY] = true;
            }
        }
    }
}
