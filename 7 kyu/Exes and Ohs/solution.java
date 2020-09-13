public class XO {
    public static boolean getXO (String str) {
        int x = 0, o = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'o')
                o++;
            else if(str.charAt(i) == 'x')
                x++;
        }
        return x == o;
    }
}
