import java.util.Scanner;

public class Main2577Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            temp *= n;
        }
        String s = String.valueOf(temp);
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            boolean ty = false;
            for (int j = 0; j < s.length(); j++) {
                if(String.valueOf(i).equals(String.valueOf(s.charAt(j)))) {
                    sum ++;
                    ty = true;
                }
            }
            if(ty) {
                s = s.replaceAll(String.valueOf(i), "");
            }
            System.out.println(sum);
        }
    }

}
