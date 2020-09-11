import java.lang.StringBuilder;
import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {
        return Arrays.stream(new StringBuilder(Long.toString(n))
                     .reverse().toString().split(""))
                     .mapToInt(i -> Integer.parseInt(i)).toArray();
    }
}
