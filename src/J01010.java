import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < T; t++) {
            String s = scanner.nextLine();
            String result = stringConvert(s);
            if (result.equals("No")) {
                System.out.println("INVALID");
            } else {
                System.out.println(result);
            }
        }

        scanner.close();
    }

    public static String stringConvert(String s) {
        boolean isValid = false;
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char number = s.charAt(i);
            if (number == '0' || number == '8' || number == '9') {
                newString += '0';
            } else if (number == '1') {
                newString += '1';
                isValid = true;
            } else {
                return "No";
            }
        }
        int startIndex = 0;
        while (startIndex < newString.length() - 1 && newString.charAt(startIndex) == '0') {
            startIndex++;
        }
        if (isValid == true) {
            return newString.substring(startIndex);
        } else
            return "No";
    }
}
