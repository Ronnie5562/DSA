package LeetCode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 15;
        boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }

    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num / 2;

        if (num == 1){
            return true;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if ((long) mid * mid > (long) num){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
