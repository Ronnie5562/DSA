package BinarySearch;

public class FindArrayFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 21, 23, 29, 30};
        int target = 2;
        int ans = findFloor(arr, target);
        System.out.println(ans >= 0 ? "Array Floor: " + arr[ans] : "The target is smaller than every element is the array, so the array does not have a floor at this particular target.");
    }

    static int findFloor(int[] arr, int target) {
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
        return arr.length - 1 >= end ? end : -1;
    }
}
