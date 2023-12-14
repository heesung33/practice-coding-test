import java.util.Scanner;

public class Main10809Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] arr = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,};
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (String.valueOf(s1.charAt(i)).equals(String.valueOf(s.charAt(j)))) {
                    if (arr[j] == -1) {
                        arr[j] = i;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}



