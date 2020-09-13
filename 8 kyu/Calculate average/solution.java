import java.util.Arrays;

public class Kata {
    public static double find_average(int[] array) {
        return (double)(Arrays.stream(array).sum()) / array.length;
    }
}
