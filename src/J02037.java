import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            int n = s.length;
            int[] a = new int[n];
            int evenNumbers = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[i]);
                if (a[i] % 2 == 0) {
                    evenNumbers++;
                }
            }
            if (a.length % 2 == 0 && evenNumbers > a.length - evenNumbers) {
                System.out.println("YES");
            } else if (a.length % 2 != 0 && evenNumbers < a.length - evenNumbers) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
