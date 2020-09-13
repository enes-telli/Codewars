import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0)
            return null;
		    return Arrays.stream(phrase.split("\\s"))
                     .map(i -> new StringBuilder(i).replace(0, 1, Character.toString(i.charAt(0)).toUpperCase()))
                     .collect(Collectors.joining(" "));
    }
}
