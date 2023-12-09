package LeetCode;

public class ArrangeCoinSolution {
    public int arrangeCoins(int n) {
        long start = 0, end = n;
        long mid, sum_of_nums_from_zero_to_mid;

        while(start <= end) {
            mid = start + (end - start) / 2;
            sum_of_nums_from_zero_to_mid = mid * (mid + 1) / 2;

            if (sum_of_nums_from_zero_to_mid > n) {
                end = mid - 1;
            } else if (sum_of_nums_from_zero_to_mid < n) {
                start = mid + 1;
            } else {
                return (int) mid;
            }
        }

        return (int) end;
    }
}