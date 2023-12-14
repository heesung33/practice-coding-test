import java.util.Scanner;

public class Main1152Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int temp = 1;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                temp += 1;
            }
        }
        if(String.valueOf(s.charAt(0)).equals(" ")) {
            temp -=1;
        }
        if(String.valueOf(s.charAt(s.length() - 1)).equals(" ")) {
            temp -=1;
        }
        System.out.println(temp);
    }
}
