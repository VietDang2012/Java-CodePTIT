import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSortSteps(arr);
        scanner.close();
    }

    public static void insertionSortSteps(int[] arr) {
        System.out.print("Buoc 0: ");
        System.out.print(arr[0] + " ");
        System.out.println();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            printStep(i, arr);
        }
    }

    public static void printStep(int step, int[] arr) {
        System.out.print("Buoc " + step + ": ");
        for (int k = 0; k <= step; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
