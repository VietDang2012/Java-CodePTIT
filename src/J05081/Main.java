package J05081;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Items> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Items(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Items i : a)
            System.out.println(i);
        sc.close();
    }
}