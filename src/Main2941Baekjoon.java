import java.util.Scanner;

public class Main2941Baekjoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int temp = 0;
        String dminus = s.replaceAll("d-", "");
        temp += (length - dminus.length()) / 2;
        String cminus = s.replaceAll("c-", "");
        temp += (length - cminus.length()) / 2;
        String cequal = s.replaceAll("c=", "");
        temp += (length - cequal.length()) / 2;
        String dzequal = s.replaceAll("dz=", "");
        temp += (length - dzequal.length()) / 3;
        String lj = s.replaceAll("lj", "");
        temp += (length - lj.length()) / 2;
        String nj = s.replaceAll("nj", "");
        temp += (length - nj.length()) / 2;
        String dzminusd = s.replaceAll("dz=", "");
        String zequal = dzminusd.replaceAll("z=", "");
        temp += (dzminusd.length() - zequal.length()) / 2;
        String seqaul = s.replaceAll("s=", "");
        temp += (length - seqaul.length()) / 2;
        String all = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=|[a-z]", "");
        s = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "");
        length = s.length();
        String alpha = s.replaceAll("[a-z]", "");
        temp += length - alpha.length();

        String giho = all.replaceAll("[-=]", "");
        temp += all.length() - giho.length();
        System.out.print(temp);
    }
}
