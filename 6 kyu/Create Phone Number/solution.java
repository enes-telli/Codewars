public class Kata {
    public static String createPhoneNumber (int[] n) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7], n[8], n[9]);
    }
}
