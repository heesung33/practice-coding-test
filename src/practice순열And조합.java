public class practice순열And조합 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int output[] = new int[arr.length];
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            permutation(arr, output, visited, 0, i + 1);
            // arr = 원본 배열, output = 출력하고자 하는 배열, visited = 방문여부, depth 현재 탐색하고 있는 인덱스, r =  뽑고자하는 개수
        }
//        for (int i = 0; i < arr.length; i++) {
//            combination(arr, visited, 0, 0, i + 1);
//            // arr = 원본 배열, visited = 방문 여부, start = 탐색의 시작 인덱스, depth, 현재 탐색하고 있는 인덱스, r = 뽑고자하는 개수
//        }
    }

    private static void permutation(int arr[], int output[], boolean visited[], int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }

    private static void combination(int[] arr, boolean[] visited, int start, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(arr, visited, i + 1, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}
