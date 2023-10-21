// This challenge is similar to the ceiling challenge
package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'd', 'f', 'g', 'r', 'v', 'z'};
        char target = 'b';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
