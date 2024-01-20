import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (!st.isEmpty() && ((x + st.peek()) % 2 == 0)) {
                st.pop();
            } else {
                st.push(x);
            }
        }
        System.out.println(st.size());
        sc.close();
    }
}
