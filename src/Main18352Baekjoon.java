import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main18352Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static List<Integer> index;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int k = Integer.parseInt(st.nextToken()); // 거리
        int x = Integer.parseInt(st.nextToken()); // 출발지점
        visited = new boolean[n + 1];
        index = new ArrayList<>();
        distance = new int[n + 1];
        arrayList = new ArrayList[n + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);}
        for (int i = 0; i < arrayList.length; i++) {
            Collections.sort(arrayList[i]);
        }
        bfs(x, k);
    }

    public static void bfs(int x, int k) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
        distance[x] = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i : arrayList[v]) {
                if (!visited[i]) {
                    distance[i] = distance[v] + 1;
                    if(distance[i] == k){
                        index.add(i);
                    }
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        if (index.size() == 0) {
            System.out.print(-1);
        } else {
            Collections.sort(index);
            for (int i : index) {
                System.out.println(i);
            }
        }
    }
}
