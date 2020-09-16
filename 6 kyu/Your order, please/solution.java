public class Order {
    public static String order(String sentence) {
        if(sentence.equals(""))
            return "";
        
        String[] words = sentence.split("\\s");
        String[] result = new String[words.length];
        for(int i = 0; i < words.length; i++) {
            result[Character.getNumericValue(words[i].replaceAll("[^0-9]", "").charAt(0)) - 1] = words[i];
        }
        return String.join(" ", result);
    }
}
