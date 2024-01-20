package J05042;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contestant> contestants = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int correctAnswer = sc.nextInt();
            int submit = sc.nextInt();
            sc.nextLine();
            Contestant x = new Contestant(name, correctAnswer, submit);
            contestants.add(x);
        }
        Collections.sort(contestants, new Comparator<Contestant>() {
            @Override
            public int compare(Contestant a, Contestant b) {
                if (a.getCorrectAnswer() == b.getCorrectAnswer()) {
                    if (a.getSubmit() == b.getSubmit()) {
                        return a.getName().compareTo(b.getName());
                    }
                    return a.getSubmit() - b.getSubmit();
                }
                return b.getCorrectAnswer() - a.getCorrectAnswer();
            }
        });
        for (Contestant x : contestants) {
            System.out.println(x);
        }
        sc.close();
    }
}
