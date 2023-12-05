

public class Main86051 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            boolean status = false;
            for(int j = 0; j< num.length; j++ ) {
                if (i == num[j]) {
                    status = true;
                    break;
                }
            }
            if(!status) {
                temp +=i;
            }
        }
        System.out.println(temp);
    }
}
