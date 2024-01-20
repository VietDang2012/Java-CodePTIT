import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> st = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (st.empty() || !st.peek().equals(s.substring(i, i + 1))) {
                st.push(s.substring(i, i + 1));
            } else {
                st.pop();
            }
        }
        if (st.empty()) {
            System.out.println("Empty String");
        } else {
            for (String x : st) {
                System.out.print(x);
            }
        }
        sc.close();
    }
}
