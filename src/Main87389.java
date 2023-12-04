public class Main87389 {
    public static void main(String[] args) {
        int n = 12;
        int temp = 0;
        int x = 2;
        while (temp != 1) {
            temp = n % x;
            x++;
        }
        System.out.println(x-1);
    }
}
