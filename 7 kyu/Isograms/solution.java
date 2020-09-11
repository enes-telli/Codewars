import java.util.Arrays;
import java.util.List;

public class isogram {
    public static boolean isIsogram(String str) {
        List<String> list = Arrays.asList(str.toLowerCase().split(""));
        return list.stream().distinct().count() == list.stream().count();
    } 
}
