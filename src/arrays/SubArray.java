package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,7,5};
        int sum = 12;

        for (int i = 0; i < arr.length; i++) {
            int currSum = arr[i];

            if (currSum == sum) {
                System.out.println("Sum found at index " + i);
            }

            else {
                for (int j = i+1 ; j < arr.length; j++) {
                    currSum += arr[j];

                    if (currSum == sum) {
                        System.out.println("Sum is found at index from " + i + " to " + j);
                        return;
                    }
                }
            }
        }
    }
}
