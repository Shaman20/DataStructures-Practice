package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class shuffleArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        createArray(size, arr);
        int[] new_arr = new int[arr.length + arr.length];
        conacatenateArray(arr, new_arr);
    }

    public static void conacatenateArray(int[] arr, int[] new_arr) {
        new_arr = new int[arr.length];
        new_arr = arr;
        System.out.println(Arrays.toString(new_arr));
    }

    public static void createArray(int size, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are " + Arrays.toString(arr));
    }

}
