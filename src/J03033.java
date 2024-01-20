import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static BigInteger lcm(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        return a.multiply(b).divide(gcd);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger result = lcm(a, b);
            System.out.println(result);
        }
        scanner.close();
    }
}
