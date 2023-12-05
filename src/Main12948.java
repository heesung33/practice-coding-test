public class Main12948 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String hide = "****************";
        String result = hide.substring(1, phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4, phone_number.length());
        System.out.println(result);
    }
}
