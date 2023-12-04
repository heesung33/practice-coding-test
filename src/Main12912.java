public class Main12912 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int temp = 0;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        int x = 0;
        for(int i = a; i<=b; i++) {
            x +=i;
        }
    }
}
