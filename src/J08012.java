import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J08012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> adjacencyList = new ArrayList<>(N + 1);

        for (int i = 0; i <= N; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 1; i < N; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        String result = isStarGraph(N, adjacencyList);
        System.out.println(result);
        scanner.close();
    }

    public static String isStarGraph(int N, List<List<Integer>> adjacencyList) {
        int[] degrees = new int[N + 1];
        for (int u = 1; u <= N; u++) {
            degrees[u] = adjacencyList.get(u).size();
        }

        int maxDegree = 0;
        for (int u = 1; u <= N; u++) {
            if (degrees[u] > maxDegree) {
                maxDegree = degrees[u];
            }
        }

        if (maxDegree == N - 1) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
