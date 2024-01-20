import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCases; i++) {
            String Name = sc.nextLine();
            String[] namePaths = Name.split("\\s+");
            StringBuilder formattedName = new StringBuilder();
            for (String namePath : namePaths) {
                if (!namePath.isEmpty()) {
                    String formattedPath = namePath.trim().substring(0, 1).toUpperCase()
                            + namePath.trim().substring(1).toLowerCase();
                    formattedName.append(formattedPath).append(" ");
                }
            }
            System.out.println(formattedName);
        }
        sc.close();
    }
}