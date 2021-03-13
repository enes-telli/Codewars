import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object a : mixed)
            sum += Integer.parseInt(a.toString());
        return sum;
    }
}
