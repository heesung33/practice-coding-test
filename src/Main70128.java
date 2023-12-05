public class Main70128 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{-3,-1,0,2};
        int temp = 0;
        for(int i = 0; i<a.length; i++) {
            temp += a[i] * b[i];
        }
        System.out.println(temp);
    }
}
