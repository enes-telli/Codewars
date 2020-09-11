import java.util.Arrays;

public class Kata {

    public static String formatWords(String[] words) {
        String result = "";
        if(words == null)
            return result;
        
        words = Arrays.stream(words).filter(i -> i.length() > 0).toArray(String[]::new);
        int len = words.length;
      
        for(int i = 0; i < len - 2; i++)
        {
            result += words[i] + ", ";
        }
      
        if(len > 1)
            result += words[len - 2] + " and " + words[len - 1];
        else if(len == 1)
            result += words[0];
        
        return result;
    }

}
