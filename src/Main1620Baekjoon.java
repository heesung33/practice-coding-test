import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1620Baekjoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> hashMap = new HashMap<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<String> dogam = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a; i++) {
            String name = br.readLine();
            dogam.add(name);
            hashMap.put(name, i + 1);
        }

        for (int i = 0; i < b; i++) {
            String query = br.readLine();
            try {
                int index = Integer.parseInt(query);
                result.append(dogam.get(index - 1)).append("\n");
            } catch (NumberFormatException e) {
                Integer index = hashMap.get(query);
                result.append(index).append("\n");
            }
        }
        System.out.print(result);
    }
}