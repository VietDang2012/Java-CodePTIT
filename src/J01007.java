import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int numTests = sc.nextInt();

        long[] fibonacciNumbers = generateFibonacciNumbers();

        for (int i = 0; i < numTests; i++) {
            long n = sc.nextLong();
            if (isFibonacci(n, fibonacciNumbers)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static long[] generateFibonacciNumbers() {
        int maxN = 92;
        long[] fibonacciNumbers = new long[maxN];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < maxN; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
        }
        return fibonacciNumbers;
    }

    public static boolean isFibonacci(long n, long[] fibonacciNumbers) {
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (n == fibonacciNumbers[i]) {
                return true;
            }
        }
        return false;
    }
}
