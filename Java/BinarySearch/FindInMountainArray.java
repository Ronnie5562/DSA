package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        //Here's the walk through of the solution.
        // We first get the peak of the mountain array, divide the array into two.
        // Then, perform orderAgnostic binarysearch to the two sides - finding the target.
        int[] arr = {1, 3, 5, 7, 9, 11, 10, 8, 6, 4, 2, 0};
        int target = 4;
        int peak = peakIndexInMountainArray(arr);
        int searchLeftArray =  orderAgnosticBinarySearch(arr, target, 0, peak);
        if (searchLeftArray != -1) {
            System.out.println(searchLeftArray);
        } else {
            int searchRightArray =  orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
            System.out.println(searchRightArray);
        }

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length + 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start; // we can actually return start/end because at the point where we get our answer, start and will point to the same value.
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start]  < arr[end];

        while (start <= end) {
            // find the middle element

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}