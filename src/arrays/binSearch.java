package arrays;

public class binSearch {

    public static int binarySearch(int[] arr, int element, int low, int high) {

        if (low <= high) {
            int mid = low + (high - low) /2;

            if (arr[mid] == element) {
                return mid;
            }

            else if (arr[mid] > element) {
                return binarySearch(arr, element, low, mid -1);
            }
            else if (arr[mid] < element) {
                return binarySearch(arr, element, mid+1, high);
            }
            else {
                System.out.println("Invalid position");
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        int element = 30;
        int low = 0;
        int high = arr.length -1;
        System.out.println(binarySearch(arr, element, low, high));
    }
}
