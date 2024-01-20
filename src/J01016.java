import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        String s = sc.nextLine();
        long n = cnt(s);
        if (n == 4 || n == 7) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        sc.close();
    }

    public static long cnt(String s) {
        long length = s.length();
        long sum = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7') {
                sum++;
            }
        }
        return sum;
    }
}
