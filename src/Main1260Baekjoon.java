import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1260Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        boolean visited[] = new boolean[N + 1]; // 방문 여부 체크

        ArrayList<Integer>[] arrayList = new ArrayList[N + 1];
        // 선언한 리스트 초기화 해주기
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }

        // 리스트에 노드 추가해주기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayList[a].add(b);
            arrayList[b].add(a);
        }

        // 자식 노드가 여러개일 때 노드 번호가 작은 것부터 방문하기
        for (int i = 0; i < arrayList.length; i++) {
            Collections.sort(arrayList[i]);
        }
        dfs(arrayList, visited, V);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(arrayList, visited, V);

    }

    public static void dfs(ArrayList<Integer>[] arrayList, boolean[] visited, int V) {
        visited[V] = true;
        System.out.print(V + " ");
        for (int i : arrayList[V]) {
            if (!visited[i]) {
                dfs(arrayList, visited, i);
            }
        }
    }

    public static void bfs(ArrayList<Integer>[] arrayList, boolean[] visited, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for(int i : arrayList[v]) {
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
