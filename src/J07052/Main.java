package J07052;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("THISINH.in"));
        List<Candidate> candidates = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            Candidate x = new Candidate(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            candidates.add(x);
        }
        Collections.sort(candidates);
        int q = Integer.parseInt(in.nextLine());
        if (q > candidates.size()) {
            q = candidates.size();
        }
        double rp = candidates.get(q - 1).getOvp();
        System.out.printf("%.1f\n", rp);
        for (Candidate i : candidates) {
            if (i.getOvp() >= rp) {
                i.setStatus("TRUNG TUYEN");
            } else {
                i.setStatus("TRUOT");
            }
            System.out.println(i);
        }
        in.close();
    }
}
