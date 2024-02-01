import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main5639Baekjoon {
    static boolean[][] visited;
    static int[][] map;
    static int[][] distance;
    static int n;
    static int m;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());
        visited = new boolean[n][m];
        map = new int[n][m];
        distance = new int[n][m];
        int knifeX = 0;
        int knifeY = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    knifeX = i;
                    knifeY = j;
                }
            }
        }
        bfs();
        int cal = distance[n - 1][m - 1];
        int meToKnife = distance[knifeX][knifeY];
        if (!visited[knifeX][knifeY]) {
            if (cal > time || cal == 0) {
                System.out.print("Fail");
            } else {
                System.out.print(cal);
            }
        } else {
            distance = new int[n][m];
            visited = new boolean[n][m];
            bfs1(knifeX, knifeY);
            meToKnife += distance[n - 1][m - 1];
            if ((meToKnife > time && cal > time)) {
                System.out.print("Fail");
            } else {
//                System.out.println(meToKnife + " " + cal);
                if(cal == 0) {
                    if(meToKnife > time) {
                        System.out.print("Fail");
                    } else {
                        System.out.print(meToKnife);
                    }
                } else {
                    System.out.print(Math.min(meToKnife, cal));
                }
            }
        }
    }

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                if (visited[nextX][nextY] || map[nextX][nextY] == 1) {
                    continue;
                }
                q.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
                distance[nextX][nextY] = distance[nowX][nowY] + 1;
            }
        }
    }

    public static void bfs1(int x, int y) {
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
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                if (visited[nextX][nextY]) {
                    continue;
                }
                q.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
                distance[nextX][nextY] = distance[nowX][nowY] + 1;
            }
        }
    }
}
