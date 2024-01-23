import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main11725Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n + 1];
        ArrayList<Integer>[] arrayList = new ArrayList[n + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        int[] index = new int[n + 1];
        bfs(visited, arrayList, 1, index);
        for (int i = 2; i < index.length; i++) {
            System.out.println(index[i]);
        }
    }

    public static void bfs(boolean[] visited, ArrayList<Integer>[] arrayList, int start, int[] index) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i : arrayList[v]) {
                if (!visited[i]) {
                    index[i] = v;
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
