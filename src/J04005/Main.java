package J04005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Examinee A = new Examinee(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("%s %s %.1f", A.getName(), A.getDateOfBirth(), A.getTotal());
        sc.close();
    }
}
