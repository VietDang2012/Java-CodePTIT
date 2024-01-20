import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int H = scanner.nextInt();

            double[] distances = calculateDistances(N, H);
            for (int i = 0; i < N - 1; i++) {
                System.out.printf("%.6f ", distances[i]);
            }
            System.out.println();
        }

        scanner.close();
    }

    public static double[] calculateDistances(int N, int H) {
        double[] distances = new double[N - 1];

        for (int i = 1; i <= N - 1; i++) {
            double distance = Math.sqrt((double) i / N) * H;
            distances[i - 1] = distance;
        }

        return distances;
    }
}
