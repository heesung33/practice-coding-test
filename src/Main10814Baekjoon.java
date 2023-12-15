import java.util.Arrays;
import java.util.Scanner;

public class Main10814Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] ageAndNameList = new String[n][2];
        for (int i = 0; i < n; i++) {
            ageAndNameList[i][0] = sc.next();
            ageAndNameList[i][1] = sc.next();
        }
        Arrays.sort(ageAndNameList, (num1, num2) -> {
            if (num1[0] == num2[0]) {
                return Integer.parseInt(num1[0]);
            } else {
                return Integer.parseInt(num1[0]) - Integer.parseInt(num2[0]);
            }
        });

        for (int i = 0; i < ageAndNameList.length; i++) {
            System.out.println(ageAndNameList[i][0] + " " + ageAndNameList[i][1]);
        }
    }
}
