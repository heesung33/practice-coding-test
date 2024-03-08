import java.util.Scanner;
import java.util.Stack;

public class Main10773Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a != 0) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        int temp = 0;
        for(int i = 0; i < stack.size(); i++) {
            temp += stack.get(i);
        }
        System.out.print(temp);
    }
}
