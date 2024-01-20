import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next()), b = new BigInteger(sc.next());
            String s = String.valueOf(a.subtract(b).abs());
            int max = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while (s.length() < max) {
                s = "0" + s;
            }
            System.out.println(s);
        }
        sc.close();
    }
}
