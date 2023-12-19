import java.util.Scanner;

public class Main1969Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        String[] sList = new String[n];

        for (int i = 0; i < n; i++) {
            sList[i] = sc.next();
        }

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < b; i++) {
            int[] counts = new int[26];

            for (int j = 0; j < n; j++) {
                counts[sList[j].charAt(i) - 'A']++;
            }

            int maxIndex = 0;
            for (int j = 1; j < counts.length; j++) {
                if (counts[j] > counts[maxIndex]) {
                    maxIndex = j;
                }
            }

            resultString.append((char) ('A' + maxIndex));
        }

        int result = calculateHammingDistance(sList, resultString.toString());

        System.out.println(resultString);
        System.out.println(result);
    }

    private static int calculateHammingDistance(String[] sList, String resultString) {
        int result = 0;

        for (String s : sList) {
            for (int j = 0; j < resultString.length(); j++) {
                if (s.charAt(j) != resultString.charAt(j)) {
                    result++;
                }
            }
        }

        return result;
    }
}
