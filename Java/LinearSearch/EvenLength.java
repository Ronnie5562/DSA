package LinearSearch;
// A more straightforward way to solve this problem is to convert the number to a string and check if the lenght of the string in even or not.
public class EvenLength {
    static int Solve(int[] nums)
    {
        int count = 0;
        for (int num : nums)
        {
            if (EvenLength.even(num))
            {
                count ++;
            }
        }
        return count;
    }

    static boolean even(int num)
    {
        int count = 0;
        while(num > 0)
        {
            num /= 10;
            count++;
        }
        return (count % 2 == 0);
    }

    public static void main(String[] args)
    {
        int[] nums = {1234, 23, 3, 967, 875, 20, 74676, 65};
        int numLength = EvenLength.Solve(nums);
        System.out.println(numLength);
    }
}
