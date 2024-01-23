import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2644Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 출발지점
        int y = Integer.parseInt(st.nextToken()); // 끝지점
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수
        visited = new boolean[n + 1];
        arrayList = new ArrayList[n + 1];
        for(int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        distance = new int[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        System.out.print(bfs(x, y));
    }
    public static int bfs(int x, int y) {
        int result =  -1;
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
        distance[x] = 0;
        loop:
        while (!q.isEmpty()) {
            int v= q.poll();
            for(int i : arrayList[v]) {
                if(!visited[i]) {
                    distance[i] = distance[v] + 1;
                    q.add(i);
                    if(y == i) {
                        result = distance[i];
                        break loop;
                    }
                    visited[i] = true;
                }
            }
        }
        return result;
    }
}
