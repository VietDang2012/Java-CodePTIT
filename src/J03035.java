import java.util.Scanner;

public class J03035 {
    public static char[] a, b;
    public static int count;
    public static int[] memo;

    public static void Try(int index) {
        if (index == a.length) {
            long x = Long.parseLong(new String(a));
            long y = Long.parseLong(new String(b));
            if (x > y) {
                count++;
            }
            return;
        }
        if (a[index] == '?') {
            for (char i = '0'; i <= '9'; i++) {
                a[index] = i;
                Try(index + 1);
            }
            a[index] = '?';
        } else {
            Try(index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            a = sc.nextLine().toCharArray();
            b = sc.nextLine().toCharArray();
            count = 0;
            memo = new int[a.length];
            Try(0);
            System.out.println(count);
        }
        sc.close();
    }
}
