public class FakeBinary {
    public static String fakeBin(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += Character.getNumericValue(str.charAt(i)) < 5 ? "0" : "1";
        }
        return result;
    }
}
