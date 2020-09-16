import java.util.Arrays;

public class Solution {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x) ? true : false;
    }
}
