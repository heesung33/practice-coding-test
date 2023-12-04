public class Main12947 {
    public static void main(String[] args) {
        int x = 18;
        String s = String.valueOf(x);
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
             temp += Integer.parseInt(s.substring(i, i+1));
        }
        if(Integer.parseInt(s) % temp == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
