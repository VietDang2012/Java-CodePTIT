import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = CaculateFactorials(n);
        System.out.println(result);
        sc.close();
    }

    public static long CaculateFactorials(int n) {
        long product = 1;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            product *= i;
            sum += product;
        }
        return sum;
    }
}
