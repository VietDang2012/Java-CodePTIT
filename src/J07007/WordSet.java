package J07007;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> wordSet = new TreeSet<>();

    public WordSet(String s) throws IOException {
        Scanner in = new Scanner(new File(s));
        while (in.hasNext()) {
            wordSet.add(in.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (String word : wordSet) {
            res += word + "\n";
        }
        return res;
    }
}
