import java.util.*;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubleSort(arr, n);
        sc.close();
    }

    static void bubleSort(int arr[], int n) {
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwap = true;
                }
            }
            if (isSwap) {
                System.out.print("Buoc " + (i + 1) + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
