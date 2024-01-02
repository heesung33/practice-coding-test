import java.util.*;

public class Main10610Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Arrays.sort(arr);

        List<Integer> permutations = generatePermutations(arr);

        int maxNum = findMax(permutations);
        System.out.println(maxNum);

//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        Set<String> stringSet = new HashSet<>();
//        String[] arr = new String[s.length()];
//        for (int t = 0; t < arr.length; t++) {
//            arr[t] = String.valueOf(s.charAt(t));
//        }
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                StringBuilder sb = new StringBuilder();
//                String temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                for (int y = 0; y < arr.length; y++) {
//                    sb.append(arr[y]);
//                }
//                stringSet.add(String.valueOf(sb));
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
//                    StringBuilder sb = new StringBuilder();
//                    String temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                    for(int y = 0; y < arr.length; y++) {
//                        sb.append(arr[y]);
//                    }
//                    stringSet.add(String.valueOf(sb));
//                }
//            }
//        }
//        List<String> list = new ArrayList<>(stringSet);
//        Collections.sort(list, Collections.reverseOrder());
//        boolean ty = false;
//        for (String j : list) {
//            if(Integer.parseInt(j) % 30 == 0){
//                System.out.println(j);
//                ty = true;
//                break;
//            }
//        }
//        if(!ty) {
//            System.out.println(-1);
//        }
    }
    private static List<Integer> generatePermutations(char[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;

        do {
            int num = Integer.parseInt(new String(arr));
            result.add(num);
        } while (nextPermutation(arr, n));

        return result;
    }

    private static boolean nextPermutation(char[] arr, int n) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = n - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }

        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
    private static int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            max = Math.max(max, num);
        }
        return max;
    }
}
