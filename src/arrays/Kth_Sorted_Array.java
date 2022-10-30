package arrays;

import java.util.Arrays;

public class Kth_Sorted_Array {

    public static void main(String[] args) {
        int k = 3;
        int[] arr1 = new int[]{2, 3, 6, 7, 9};
        int[] arr2 = new int[]{1, 4, 8, 10};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        System.arraycopy(arr1, 0, arr3, 0, n1);
        System.arraycopy(arr2, 0, arr3, n1, n2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[k]);
//        }
        System.out.println(arr3[k]);
//        System.out.println(Arrays.toString(arr3));
    }
}
