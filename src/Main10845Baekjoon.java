import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main10845Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int size = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            String s = stringTokenizer.nextToken();
            if (s.equals("push")) {
                int x = Integer.parseInt(stringTokenizer.nextToken());
                size++;
                push(x, list);
            } else if (s.equals("pop")) {
                if(list.size() != 0){
                    size--;
                }
                System.out.println(pop(list));
            } else if (s.equals("size")) {
                System.out.println(size);
            } else if (s.equals("empty")) {
                System.out.println(empty(list));
            } else if (s.equals("front")) {
                System.out.println(front(list));
            } else if (s.equals("back")) {
                System.out.println(back(list));
            }
        }
    }

    public static void push(int x, List<Integer> list) {
        list.add(x);
    }

    public static int pop(List<Integer> list) {
        if (list.size() == 0) {
            return -1;
        }
        int n = list.get(0);
        list.remove(0);
        return n;
    }

    public static int empty(List<Integer> list) {
        if (list.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front(List<Integer> list) {
        if (list.size() == 0) {
            return -1;
        } else {
            return list.get(0);
        }
    }

    public static int back(List<Integer> list) {
        if (list.size() == 0) {
            return -1;
        } else {
            return list.get(list.size() - 1);
        }
    }
}
