public class Kata {
    public static String findNeedle(Object[] haystack) {
        int i;
        for(i = 0; i < haystack.length; i++)
        {
            if(haystack[i] != null && haystack[i].toString() == "needle")
                break;
        }
        return "found the needle at position " + i;
    }
}
