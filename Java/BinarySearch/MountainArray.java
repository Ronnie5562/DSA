package BinarySearch;



public class MountainArray {
    public static void main(String[] args) {
        int[] mountainArray = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(mountainArray));

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

        return start;
    }
}
