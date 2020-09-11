import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateEncoder {
	  static String encode(String word) {
        List<String> list = Arrays.asList(word.toLowerCase().split(""));
        return list.stream()
                   .map(t -> Collections.frequency(list, t) > 1 ? ")" : "(")
                   .collect(Collectors.joining(""));
    }
}
