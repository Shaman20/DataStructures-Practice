package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class GFG2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            arrayList.add(arr[i]);
        }
        Collections.sort(arrayList, Collections.reverseOrder());

        for (int j = k; j < n; j++) {
            arrayList2.add(arr[j]);
            Collections.sort(arrayList2, Collections.reverseOrder());
        }
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
    }
}
