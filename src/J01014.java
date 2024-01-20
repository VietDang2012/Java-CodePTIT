import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); // Đọc số lượng bộ test
        for (int t = 1; t <= testCases; t++) {
            long n = sc.nextLong();
            long result = findMax(n);
            System.out.println(result);
        }

        sc.close();
    }

    public static long findMax(long n) {
        long maxRes = 1;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    maxRes = Math.max(maxRes, i);
                    n /= i;
                }
            }
        }
        if (n > 1) {
            maxRes = Math.max(maxRes, n);
        }
        return maxRes;
    }
}
