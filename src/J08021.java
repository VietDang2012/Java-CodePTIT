import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            String input = sc.nextLine();
            int maxLength = findLongestValidParentheses(input);
            System.out.println(maxLength);
        }
        sc.close();
    }

    private static int findLongestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.empty()) {
                    maxLength = Math.max(maxLength, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }
        return maxLength;
    }
}
