package sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = new int[]{7,8,3,1,2};
        System.out.println("Unsorted Array " + Arrays.toString(arr));
        // Runs through the entire array
        for (int i = 0; i < arr.length; i++) {
            // Run only till unsorted elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Peak element is " + arr[4]);
        System.out.println("Sorted Array " + Arrays.toString(arr));
    }
}
