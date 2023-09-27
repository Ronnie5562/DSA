package LinearSearch;

public class Search2DArray {
    public static void main(String[] args)
    {
        String[][] StudentNames = {
                {"Sharon", "Benita", "Stargirl"},
                {"Richard", "Ronald", "Starboy"},
                {"Primeswaggs", "SharonicOcean", "Bennie"}
        };

        String target = "Primeswaggs";

        boolean FoundStudent = searcharray(StudentNames, target);

        if (FoundStudent)
        {
            System.out.println("Student Found");
        } else {
            System.out.println("Student Not Found");
        }
    }

    public static boolean searcharray(String[][] arr, String name)
    {
        if (arr.length < 1)
        {
            return false;
        }

        for (String[] strings : arr) {
            for (String string : strings) {
                if (string.equals(name)) {
                    return true;
                }
            }
        }

        return false;
    }
}
