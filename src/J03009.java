import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine().trim(), s2 = sc.nextLine().trim();
            List<String> a = Arrays.asList(s1.split("\\s+"));
            List<String> b = Arrays.asList(s2.split("\\s+"));
            Set<String> set = new TreeSet<String>();
            for (String s : a) {
                if (!b.contains(s)) {
                    set.add(s);
                }
            }
            for (String s : set) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
