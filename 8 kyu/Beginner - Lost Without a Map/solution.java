import java.util.stream.IntStream;

public class Maps {
    public static int[] map(int[] arr) {
        return IntStream.of(arr).map(i -> i * 2).toArray();
    }
}
