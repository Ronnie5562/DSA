package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] result = {1, -1};
        int[] arr = {6, 8, 12, 15, 45, 45, 45, 45, 67, 200, 567};
        int target = 45;
        result[0] = Search(arr, target, true);
        if (result[0] >= 0) result[1] = Search(arr, target, false);
        System.out.println(Arrays.toString(result));
    }

    static int Search(int[] arr, int target, boolean getFirstPosition) {
        int ans = getFirstPosition ? 1 : -1;

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
                ans = mid;
                if (getFirstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
