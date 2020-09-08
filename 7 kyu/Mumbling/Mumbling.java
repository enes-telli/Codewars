public class Accumul {
    
    public static String accum(String s) {
        s = s.toLowerCase();
        String result = "";
        for (int i = 0; i < s.length(); i++) 
        {
            result += s.substring(i, i + 1).toUpperCase();
            for (int j = 0; j < i; j++) 
            {
                result += s.charAt(i);
            }
            result += "-";
        }

        return result.substring(0, result.length() - 1);
    }
}
