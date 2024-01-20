import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();
        for (int t = 0; t < testCases; t++) {
            String input = scanner.nextLine();
            String reversed = reverseWords(input);
            System.out.println(reversed);
        }
        scanner.close();
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedStr.append(reversedWord).append(" ");
        }
        return reversedStr.toString().trim();
    }
}
