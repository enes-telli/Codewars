import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(i -> (i != null) && (i == true)).toArray(Boolean[]::new).length;
    }
}
