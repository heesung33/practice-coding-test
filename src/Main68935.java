public class Main68935 {
    public static void main(String[] args) {
        String str = "";
        int n = 45;
        while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        System.out.println(Integer.parseInt(str, 3));
    }
}
