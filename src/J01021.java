import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long result = powerModulus(a, b);
            System.out.println(result);
        }
        sc.close();
    }

    public static long powerModulus(long a, long b) {
        long MOD = 1000000007;
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }
}
