public class TotalPoints {
    public static int points(String[] games) {
        int result = 0;
        for(String s : games) {
            if (s.charAt(0) == s.charAt(2))
                result += 1;
            else if (s.charAt(0) > s.charAt(2))
                result += 3;
        }
        return result;
    }
}
