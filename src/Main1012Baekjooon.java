import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1012Baekjooon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            boolean[] visited = new boolean[M];
            ArrayList<Integer>[] arrayList = new ArrayList[M];
            for (int j = 0; j < arrayList.length; j++) {
                arrayList[j] = new ArrayList<>();
            }
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arrayList[a].add(b);
                arrayList[b].add(a);
            }
            bfs(visited, arrayList, 0);
            System.out.println();
        }
    }

    public static void bfs(boolean[] visited, ArrayList<Integer>[] arrayList, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int i : arrayList[v]) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
