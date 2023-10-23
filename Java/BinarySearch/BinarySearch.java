package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-27, -5, 0, 2, 4, 5, 6, 8, 12, 15, 45, 67, 84, 99, 200, 567};
        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
