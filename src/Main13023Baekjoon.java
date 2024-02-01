import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main13023Baekjoon {
    static int[] distance;
    static boolean[] visited;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new ArrayList[n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        int result = 0;
        for(int i = 0; i <=n; i++) {
            visited = new boolean[n + 1];
            distance = new int[n + 1];
            dfs(i);
            Arrays.sort(distance);
            if(distance[distance.length - 1] >= 4) {
                result = 1;
                break;
            }
        }
        System.out.print(result);

    }

    public static void dfs(int x) {
        visited[x] = true;

        for(int i : arr[x]) {
            if(!visited[i]) {
                distance[i] = distance[x] + 1;
                dfs(i);
            }
        }
    }

//    public static void bfs(int x) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(x);
//        visited[x] = true;
//        while (!q.isEmpty()) {
//            int v = q.poll();
//            for(int i : arr[v]) {
//                if(!visited[i]) {
//                    q.add(i);
//                    visited[i] = true;
//                    distance[i] = distance[v] + 1;
//                }
//            }
//        }
//    }
}
