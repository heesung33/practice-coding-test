import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1926Baekjoon {
    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] map;

    static int[] dx = {-1, 1, 0, 0};
    static List<Integer> list;

    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n][m];
        map = new int[n][m];
        list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(visited[i][j] || map[i][j] == 0){
                    continue;
                }
                bfs(i, j);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        if (list.size() != 0) {
            System.out.print(list.get(list.size() -1));
        } else {
            System.out.print(0);
        }
    }
    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[x][y] = true;
        int count = 1;
        int nowX = 0;
        int nowY = 0;
        while (!q.isEmpty()) {
            int now[] = q.poll();
            nowX = now[0];
            nowY = now[1];
            for(int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(nextX < 0 || nextY < 0 || nextX >=n || nextY >= m) {
                    continue;
                }
                if(visited[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }
                count++;
                q.add(new int[] { nextX, nextY});
                visited[nextX][nextY] = true;
                map[nextX][nextY] = count;
            }
        }
        list.add(map[nowX][nowY]);
    }
}
