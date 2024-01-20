import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); // Đọc số lượng bộ test

        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt(); // Đọc số nguyên N

            int count = countDivisibleByTwo(n);
            System.out.println(count);
        }

        scanner.close();
    }

    public static int countDivisibleByTwo(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i % 2 == 0)
                    count++;
                if ((n / i) % 2 == 0) {
                    count++;
                }
            }
            if (i * i == n && i % 2 == 0) {
                count--;
            }
        }

        return count;
    }
}
