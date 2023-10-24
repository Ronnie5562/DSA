// This particular task is quite tricky because I was told to assume I have an Infinite array and try to find the index of a
// particular target. So, I have to assume that I don't have access to the length of the array since it is an infinite array.
// At this point I know I'm not meant to use arr.length method ❌


// Now, Let's explain how we're going to solve this problem.
/*
*  Originally, when solving problems using binary search, we first of all get the mid point of the larger array and check if
*  our target value is either on the right side or on the left side, then we change our focus the the side which it's on,
*  get the mid of that area and keep on repeating the process till we find our target.
*
*  But, in this case, we cannot get the initial mid point, so we cannot use the same approach. What if we reverse the binary search algorithm 🤔💭 ?
*  Instead of reducing our search space, we can start from the first two items (sub-array) of the array and start increasing our search space (sub-array) t
*  ill we get the sub-array that has our target in it. Let's Goooo....
* */

package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-27, -5, 0, 2, 4, 5, 6, 8, 12, 15, 45, 67, 84, 99, 200, 567};
        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }


    public static int SearchArray() {
        return 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
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
