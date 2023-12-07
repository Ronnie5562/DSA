// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
package LeetCode;

public class squareRootSolution {
    public static void main(String[] args) {
        int answer = mySqrt(2147395599);
        System.out.println(answer);
    }

    static int mySqrt(int x) {
        int start = 1;
        int end = x;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return mid;
            } else if ((long)  mid * mid > (long) x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start - 1;
    }
}