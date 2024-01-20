import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0; t < test; t++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] A = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            int[][] B = new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    B[j][i] = A[i][j];
                }
            }
            int[][] C = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("Test " + (t + 1) + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
