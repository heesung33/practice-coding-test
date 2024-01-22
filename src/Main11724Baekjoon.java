import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11724Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[N + 1];
        ArrayList<Integer>[] arrayList = new ArrayList[N + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        int count = 0;
        for(int i = 1; i < N+1; i++) {
            if(!visited[i]) {
                bfs(visited, arrayList, i);
                count++;
            }
        }
        System.out.print(count);
    }
    public static void bfs(boolean[] visited, ArrayList<Integer>[] arrayList, int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = true;
        while (!q.isEmpty()){
            int v = q.poll();
            for(int i : arrayList[v]) {
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
