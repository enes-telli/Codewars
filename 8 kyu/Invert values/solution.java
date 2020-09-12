import java.util.stream.IntStream;

public class Kata {
    public static int[] invert(int[] array) {
        return IntStream.of(array).map(i -> -i).toArray();
    }
}
