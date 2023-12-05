import java.util.Arrays;

public class Main12982 {
    public static void main(String[] args) {
        int[] d = new int[]{2,2,3,3};
        int budget = 10;
        int temp = 0;
        int cal = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if(temp + d[i] <= budget) {
                temp +=d[i];
                cal++;
            }
        }
        System.out.println(cal);
    }
}
