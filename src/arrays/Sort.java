package arrays;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,1,5,6,0};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}
