import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1389Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static int n;
    static int m;
    static boolean[] visited;
    static int[] distance;

    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        distance = new int[n + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        int result = 0;
        int temp = 999999999;
        for (int i = 1; i <= n; i++) {
            count = 0;
            bfs(i);
            if(temp > count) {
                temp = count;
                result = i;
            }
            visited = new boolean[n + 1];
            distance = new int[n + 1];
        }
        System.out.print(result);
    }

    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
        distance[x] = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i : arrayList[v]) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    distance[i] = distance[v] + 1;
                    count += distance[i];
                }
            }
        }

    }
}
