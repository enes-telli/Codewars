import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        List<String> chars = Arrays.asList(text.toLowerCase().split(""));
        String result = "";
        for(String c : chars)
        {
            if(Collections.frequency(chars, c) > 1 && !result.contains(c))
            {
                result += c;
            }
        }
        return result.length();
    }
}
