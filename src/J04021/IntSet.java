package J04021;

import java.util.Arrays;

public class IntSet {
    private int[] elements;
    private int size;

    public IntSet(int[] input) {
        // Loại bỏ các giá trị trùng lặp và sắp xếp tập hợp
        Arrays.sort(input);
        size = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {
                size++;
            }
        }

        elements = new int[size];
        elements[0] = input[0];
        int index = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {
                elements[index] = input[i];
                index++;
            }
        }
    }

    public IntSet union(IntSet other) {
        int[] result = new int[size + other.size];
        int i = 0, j = 0, k = 0;
        while (i < size && j < other.size) {
            if (elements[i] < other.elements[j]) {
                result[k] = elements[i];
                i++;
            } else {
                result[k] = other.elements[j];
                j++;
            }
            k++;
        }
        while (i < size) {
            result[k] = elements[i];
            i++;
            k++;
        }
        while (j < other.size) {
            result[k] = other.elements[j];
            j++;
            k++;
        }
        return new IntSet(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
