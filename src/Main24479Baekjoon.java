import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main24479Baekjoon {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static int[] first;
    static int cal = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int k = Integer.parseInt(st.nextToken()); // 출발점
        arrayList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        first = new int[n + 1];
        for(int i = 0; i< arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for(int i = 0; i< m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        for(int i = 0; i< arrayList.length; i++) {
            Collections.sort(arrayList[i]);
        }
        Arrays.fill(first, 0);
        dfs(k);
        for(int i = 1; i< first.length; i++) {
            System.out.println(first[i]);
        }
    }
    public static void dfs(int k) {
        visited[k] = true;
//        System.out.println(k);
        first[k] = cal;
        cal++;
        for(int i : arrayList[k]) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }
}
