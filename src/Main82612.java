public class Main82612 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long temp = 0;
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            temp += price * i;
        }
        if(temp > money) {
            answer = temp - money;
        }

        System.out.println(answer);
    }
}
