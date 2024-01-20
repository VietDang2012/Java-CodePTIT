import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String result = findLexicographicallyLargestSubstring(s);
        System.out.println(result);
        scanner.close();
    }

    public static String findLexicographicallyLargestSubstring(String s) {
        int n = s.length();
        int maxChar = -1;
        StringBuilder result = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            if (currentChar >= maxChar) {
                result.insert(0, currentChar);
                maxChar = currentChar;
            }
        }
        return result.toString();
    }
}
