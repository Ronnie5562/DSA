package LinearSearch;

  public class LinearSearch {
    public static void main(String[] args)
    {
      int[] array = {10, 5, 3, 76, 44, 34, 73, 92, 37, 47, 76, 54, 63, 0};
      int target = 47;


      boolean found = linearsearch(array, target);

      if (found)
      {
        System.out.println("Target Found");
      } else {
        System.out.println("Target Not Found");
      }
    }

    public static boolean linearsearch(int[] arr, int target)
    {
      if (arr.length < 1)
        return false;

      for (int i : arr)
      {
        if (i == target)
          return true;
      }

      return false;
    }
}
