import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main5567Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static int[] distance;
    static int cal = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        distance = new int[n + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        bfs();
        System.out.println(cal);
    }
    public static void bfs() {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        visited[1] = true;
        distance[1] = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            for(int i : arrayList[v]) {
                if(!visited[i]) {
                    distance[i] = distance[v] + 1;
                    if(distance[i] < 3) {
                        cal++;
                    }
                    q.add(i);
                    visited[i] =true;
                }
            }
        }
    }
}
