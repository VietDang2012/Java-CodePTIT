import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            long result = calculateFibonacci(n);
            System.out.println(result);
        }
        scanner.close();
    }

    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        long prev1 = 1;
        long prev2 = 1;
        long current = 0;
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }
}
