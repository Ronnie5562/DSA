package LinearSearch;

public class SearchStrings {
    public static void main(String[] args) {
        String Myname = "Abimbola Ronald";
        char target = 'z';

        boolean foundString = stringsearch(Myname, target);

        if (foundString)
        {
            System.out.println("Target String Found");
        } else {
            System.out.println("Target String Not Found");
        }
    }

    public static boolean stringsearch(String str, char target)
    {
        if (str.isEmpty())
        {
            return false;
        }

        for (char c : str.toCharArray())
        {
            if (c ==target)
            {
                return true;
            }
        }

        return false;
    }
}
