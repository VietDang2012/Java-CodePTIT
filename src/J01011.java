import java.util.Scanner;

public class J01011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); // Đọc số lượng bộ test

        for (int t = 0; t < testCases; t++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = findGCD(a, b);
            long lcm = a * b / gcd;
            System.out.println(lcm + " " + gcd);
        }

        sc.close();
    }

    public static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
