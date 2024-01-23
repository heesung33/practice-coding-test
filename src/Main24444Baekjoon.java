import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main24444Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static int[] first;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        first = new int[n + 1];
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

        Arrays.fill(first, 0);
        bfs(k);
        for(int i = 1; i< first.length; i++) {
            System.out.println(first[i]);
        }
    }

    public static void bfs(int k) {
        int cal = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        visited[k] = true;
        first[k] = cal;

        while (!q.isEmpty()) {
            int v = q.poll();
            for(int i : arrayList[v]) {
                if(!visited[i]) {
                    q.add(i);
                    cal++;
                    first[i] = cal;
                    visited[i] = true;
                }
            }
        }
    }
}
