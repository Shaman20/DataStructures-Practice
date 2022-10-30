package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class GFG1 {

    public static void main(String[] args) {

        int[] arr = new int[]{16,17,4,3,5,2};
        int n = arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int ele = arr[n-1];
        arrayList.add(ele);
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] > ele) {
                arrayList.add(arr[i]);
                ele = arr[i];
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);
    }
}
