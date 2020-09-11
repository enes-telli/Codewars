import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split("\\s+")).mapToInt(String::length).min().getAsInt();
    }
}
