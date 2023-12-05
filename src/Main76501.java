public class Main76501 {
    public static void main(String[] args) {
        int[] absolutes = new int[]{4, 7, 12};
        boolean[] signs = new boolean[]{true,false,true};
        int result = 0;
        for(int i = 0; i<absolutes.length; i++) {
            if(!signs[i]) {
                result += absolutes[i] * -1;
            } else {
                result += absolutes[i];
            }
        }
        System.out.println(result);
    }
}
