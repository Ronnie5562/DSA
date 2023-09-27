package LinearSearch;

public class FindMinMax {
    public static void main(String[] args)
    {
        int[] NumArray = {60, 16, 22, 13, 34, 65, 86, 7, 58, 79, 10};

        int MinNum = FindMin(NumArray);
        int MaxNum = FindMax(NumArray);

        System.out.println("Minimum Value = " + MinNum);
        System.out.println("Maximum Value = " + MaxNum);
    }

    public static int FindMin(int[] arr)
    {
        int min = arr[0];
        for (int i : arr)
        {
            if (i < min)
            {
                min = i;
            }
        }
        return min;
    }

    public static int FindMax(int[] arr)
    {
        int max = arr[0];
        for (int i : arr)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }
}
