import java.util.HashSet;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            set.add(x);
            max = Math.max(max, x);
        }
        boolean isValid = true;
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                isValid = false;
                System.out.println(i);
            }
        }
        if (isValid) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
