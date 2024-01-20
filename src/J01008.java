import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int t = 1; t <= testCases; t++) {
            long n = sc.nextLong();
            System.out.printf("Test " + t + ": ");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                long cnt = 0;
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                        cnt++;
                    }
                    System.out.printf(i + "(" + cnt + ") ");
                }
            }
            if (n > 1) {
                System.out.printf(n + "(1)");
            }
            System.out.printf("\n");
        }
        sc.close();
    }

}
