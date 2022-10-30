package arrays;

import java.util.*;

public class Interview {

    public static void main(String[] args) {
        int[] arr = new int[]{0,6,3,7,7,5,4};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i +1; j < arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    arr[j++] = arr[i];
                }
                arr[j++] = arr[arr.length-1];
                Arrays.sort(arr);
            }
        }
        System.out.println("Sorted Array " + Arrays.toString(arr));
    }
}
