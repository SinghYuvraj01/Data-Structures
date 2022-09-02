import java.util.*;

public class selectionSort {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int lastIndex = size - 1 - i;

            // Function to find index with minimum index
            int minIndex = findMinIndex(arr, lastIndex);
            if (arr[lastIndex] != arr[minIndex]) {
                int swap = arr[lastIndex];
                arr[lastIndex] = arr[minIndex];
                arr[minIndex] = swap;
            }
        }

        System.out.println("Array after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    static int findMinIndex(int arr[], int lastIndex) {
        // Assuming the 0th index to be min
        int min = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
}