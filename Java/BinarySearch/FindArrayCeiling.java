package BinarySearch;
// The ceiling of an array with target X, is the smallest number in that array that is greater than or equals to X.
// This problem is solved using the concept of binary search !!!!!
public class FindArrayCeiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 21, 23, 29, 30};
        int target = 15;
        int ans = findCeiling(arr, target);
        System.out.println(ans >= 0 ? "Array Ceiling: " + arr[ans] : "The target is bigger than every element is the array, so the array does not have a ceiling at this particular target.");
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
