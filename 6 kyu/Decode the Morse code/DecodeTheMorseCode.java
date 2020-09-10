public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String result = "";
        String[] morse = morseCode.trim().split(" ");
        int i = 0;
        for(String b : morse)
        {
            if(b.matches("[-.]+"))
            {
                result += MorseCode.get(b);
            }    
            else
            {
                if(i++ == 1)
                {
                    result += " ";
                    i = 0;
                }
            }
        }
        return result;
    }
}
