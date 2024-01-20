import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] result = findNextGreaterElement(arr);
            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int[] findNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return result;
    }
}
