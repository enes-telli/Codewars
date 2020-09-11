import java.util.HashMap;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length != 10) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : walk)
        {
            if(!map.containsKey(c))
            {
                map.put(c, 1);
            }
            else
            {
                map.put(c, map.get(c) + 1);
            }
        }
        if(map.get('n') != map.get('s') || map.get('w') != map.get('e'))
            return false;
        return true;
    }
}
