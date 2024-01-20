import java.io.*;
import java.util.*;

public class J07008 {
    static int n;
    static int[] a;
    static ArrayList<String> result;

    static void generateSubsequences() {
        result = new ArrayList<>();
        for (int mask = 1; mask < (1 << n); mask++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) > 0) {
                    temp.add(a[i]);
                }
            }
            if (isIncreasing(temp)) {
                StringBuilder sb = new StringBuilder();
                for (int num : temp) {
                    sb.append(num).append(" ");
                }
                result.add(sb.toString().trim());
            }
        }
        Collections.sort(result);
    }

    static boolean isIncreasing(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("DAYSO.in"));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        generateSubsequences();
        for (String sequence : result) {
            String[] part = sequence.split("\\s+");
            if (part.length > 1) {
                System.out.println(sequence);
            }
        }
        br.close();
    }
}
