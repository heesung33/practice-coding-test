public class Main12919 {
    public static void main(String[] args) {
        String[] seoul = new String[]{"Jane", "Kim"};
        for(int i= 0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                System.out.println("김서방은 " + i + "에 있다");
                break;
            }
        }
    }
}
