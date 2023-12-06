import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main12941 {
    public static void main(String[] args) {
        int answer = 0;
        int[] A = new int[]{1, 4, 2};
        int[] B = new int[]{5, 4, 4};
        int y= B.length -1;
        List<Integer> AList = new ArrayList<>();
        List<Integer> BList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            AList.add(A[i]);
            BList.add(B[i]);
        }
        Collections.sort(AList);
        Collections.sort(BList);
        for (int i = 0; i < A.length; i++) {
            answer +=AList.get(i) * BList.get(y);
            y--;
        }
        System.out.println(answer);
    }
}
