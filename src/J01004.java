import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            long N = sc.nextLong();
            boolean result = check(N);
            if (result) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }

        sc.close();
    }

    public static boolean check(long N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
