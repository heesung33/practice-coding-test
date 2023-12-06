public class Main12951 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String answer = "";
        char[] sList = new char[]{};
        sList = s.toCharArray();
        sList[0] = Character.toUpperCase(sList[0]);
        answer = answer.concat(String.valueOf(sList[0]));
        for (int i = 1; i < sList.length; i++) {
            if (String.valueOf(sList[i]).equals(" ") && i != sList.length -1) {
                sList[i + 1] = Character.toUpperCase(sList[i + 1]);
            }
            if (!String.valueOf(sList[i-1]).equals(" ")) {
                sList[i] = Character.toLowerCase(sList[i]);
            }
            answer = answer.concat(String.valueOf(sList[i]));
        }
        System.out.println(answer);
    }
}
