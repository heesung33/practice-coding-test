import java.util.ArrayList;
import java.util.Collections;

public class Main42748pro {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(sd(arr, commands));
    }

    public static int[] sd(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int z = 0; z < commands.length; z++) {
            int i = commands[z][0];
            int j = commands[z][1];
            int k = commands[z][2];
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int u = i - 1; u <= j - 1; u++) {
                arrayList.add(array[u]);
            }
            Collections.sort(arrayList);
            answer[z] = arrayList.get(k - 1);
        }
        return answer;
    }
}
