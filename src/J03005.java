import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCases; i++) {
            String Email = sc.nextLine();
            String emailAddress = "@ptit.edu.vn";
            String[] emailPaths = Email.trim().split("\\s+");
            StringBuilder formattedEmail = new StringBuilder();
            formattedEmail.append(emailPaths[emailPaths.length - 1].toLowerCase());
            for (int j = 0; j < emailPaths.length - 1; j++) {
                String formattedPath = emailPaths[j].substring(0, 1).toLowerCase();
                formattedEmail.append(formattedPath);
            }
            formattedEmail.append(emailAddress);
            System.out.println(formattedEmail);
        }
        sc.close();
    }
}