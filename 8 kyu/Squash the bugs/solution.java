import java.util.Arrays;

public class Kata {
    public static int findLongest(final String str) {
        return Arrays.stream(str.split(" ")).mapToInt(i -> i.length()).max().getAsInt();
    }
}
