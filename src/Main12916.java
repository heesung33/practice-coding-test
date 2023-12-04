public class Main12916 {
    public static void main(String[] args) {
        int p = 0;
        int y = 0;
        String s = "Pyy";
         s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'y') {
                y+=1;
            }
            if(s.charAt(i) == 'p') {
                p+=1;
            }
        }
        if(y!=p){
            System.out.println("false");
        }

    }
}
