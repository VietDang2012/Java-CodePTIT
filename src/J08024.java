import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            Queue<Long> queue = new LinkedList<>();
            queue.add(9L);
            while (!queue.isEmpty()) {
                long current = queue.poll();
                if (current % n == 0) {
                    System.out.println(current);
                    break;
                }
                queue.add(current * 10);
                queue.add(current * 10 + 9);
            }
        }
        sc.close();
    }
}
