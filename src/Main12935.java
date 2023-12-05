import java.util.ArrayList;
import java.util.List;

public class Main12935 {
    public static void main(String[] args) {
        int[] arr = new int[] {4,3,2,1};
        List<Integer> arrList = new ArrayList<>();
        int temp = 99999999;
        for (int j : arr) {
            if (temp > j) {
                temp = j;
            }
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] !=temp) {
                arrList.add(arr[i]);
            }
        }
        if(arrList.size() == 0) {
            arrList.add(-1);
        }
        int[] answer = new  int[arrList.size()];
        for(int i = 0; i<arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        for(int i : arrList) {
            System.out.println(i);
        }
    }
}
