package arrays;

public class Frequency {

    public static void main(String[] args) {

        int[] arr = new int[]{10,20,20,10,10,20,5,20};
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

    }
}
