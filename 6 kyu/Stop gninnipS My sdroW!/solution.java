import java.util.stream.Collectors;
import java.util.Arrays;

public class SpinWords {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(i -> i.length() < 5 ? i : new StringBuilder(i).reverse()).collect(Collectors.joining(" "));
    }
}
