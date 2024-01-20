import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            Queue<Long> queue = new LinkedList<>();
            ArrayList<Long> list = new ArrayList<>();
            queue.add(6L);
            queue.add(8L);
            while (!queue.isEmpty()) {
                long current = queue.poll();
                if (String.format("%s", current).length() > n) {
                    System.out.println(list.size());
                    Collections.sort(list);
                    Collections.reverse(list);
                    for (long i : list) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                }
                list.add(current);
                queue.add(current * 10 + 6);
                queue.add(current * 10 + 8);
            }
        }
        sc.close();
    }
}
