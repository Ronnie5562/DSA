package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ascendingArr = {-27, -5, 0, 2, 4, 5, 6, 8, 12, 15, 45, 67, 84, 99, 200, 567};
        int target1 = 15;
        int result1 = orderAgnosticBinarySearch(ascendingArr, target1);
        System.out.println("Index: " + result1);

        int[] descendingArr = {200, 176, 120, 111, 72, 54, 43, 33, 32, 39, 27, 21, 15, 9, 2, 1, 0};
        int target2 = 43;
        int result2 = orderAgnosticBinarySearch(descendingArr, target2);
        System.out.println("Index: " + result2);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
