import java.util.Scanner;

public class Main2839Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = 0;
        if (n < 5) {
            if (n % 3 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        } else if (n == 5) {
            System.out.println(1);
        } else if (n <= 9) {
            if ((n % 5) % 3 == 0) {
                temp += n / 5;
                temp += (n % 5) / 3;
                System.out.println(temp);
            } else if (n%3 ==0) {
                System.out.println(n/3);
            } else {
                System.out.println(-1);
            }
        } else {
            if (n % 5 == 0) {
                System.out.println(n / 5);
            } else {
                if ((n % 5) % 3 == 0) {
                    temp += n / 5;
                    temp += (n % 5) / 3;
                    System.out.println(temp);
                } else {
                    if (n >= 11) {
                        int result = (n / 5) * 5;
                        while (true) {
                            int temp1 = 0;
                            result -= 5;
                            temp1 += (n - result);
                            if (temp1 % 3 == 0) {
                                temp += temp1 / 3;
                                temp += result / 5;
                                System.out.println(temp);
                                break;
                            }
                        }
                    } else {
                        System.out.println(n / 3);
                    }
                }
            }
        }

    }
}
