import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int numTests = sc.nextInt();
        for (int i = 0; i < numTests; i++) {
            long N = sc.nextLong();
            long result = calculateSum(N);
            System.out.println(result);
        }
        sc.close();
    }

    public static long calculateSum(long N) {
        return N * (N + 1) / 2;
    }
}
