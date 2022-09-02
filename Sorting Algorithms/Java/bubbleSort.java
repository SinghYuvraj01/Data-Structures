import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };
        int size = arr.length;

        // Outer loop for the passes
        for (int i = 0; i < size - 1; i++) {
            int flag = 0;
            // Inner loop for the passes
            for (int j = 1; j < size - i; j++) {
                flag++;
                int swap = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = swap;
            }
            if (flag == 0) {
                break;
                // Means array is sorted
            }
        }

        System.out.println("Array after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}