public class Main12981 {
    public static void main(String[] args) {
        int n =3;
        String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank", "sdfs"};
        int[] answer = new int[]{0, 0};
        Loop1:
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (words[j].equals(words[i]) && i != j) {
                    answer[0] = (i + 1) % n;
                    answer[1] = (i + 1) / n;
                    if (answer[0] == 0) {
                        if(i<=n) {
                            answer[0] = 1;
                        } else {
                            answer[0] = n;
                        }
                    }
                    if ((i + 1) % n != 0) {
                        answer[1] += 1;
                    }
                    break Loop1;
                }
            }
            if (words.length - 1 != i && words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                answer[1] = (i + 2) / n;
                if ((i + 2) % n != 0) {
                    answer[1] += 1;
                }
                answer[0] = (i + 2) - ((answer[1] - 1) * n);
                if (answer[0] == 0) {
                    if(i<=n) {
                        answer[0] = 1;
                    } else {
                        answer[0] = n;
                    }
                }
                break;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
