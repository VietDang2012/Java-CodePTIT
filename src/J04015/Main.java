package J04015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher A = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.printf("%s %s %d %d %d", A.getID(), A.getName(), A.getRank(), A.getReward(), A.getIncome());
        sc.close();
    }
}
