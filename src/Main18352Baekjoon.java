import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main18352Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static List<Integer> index;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int k = Integer.parseInt(st.nextToken()); // 거리
        int x = Integer.parseInt(st.nextToken()); // 출발지점
        visited = new boolean[n + 1];
        index = new ArrayList<>();
        arrayList = new ArrayList[n + 1];
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
        for (int i = 0; i < arrayList.length; i++) {
            Collections.sort(arrayList[i]);
        }
        bfs(x, k);
    }

    public static void bfs(int x, int k) {
        int length = 0;
        int cal = 0;
        boolean ty = false;
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            length++;
            if (length > k && !ty && length >= 3) {
                cal = arrayList[v - 1].size() - 1;
                ty = true;
            }
            while (true) {
                if (cal != 0) {
                    cal--;
                    length--;
                }
                break;
            }
            for (int i : arrayList[v]) {
                if (!visited[i]) {
                    if (length == k) {
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
