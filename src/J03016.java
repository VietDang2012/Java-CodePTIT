import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-- > 0) {
            BigInteger x = sc.nextBigInteger();
            if (x.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
