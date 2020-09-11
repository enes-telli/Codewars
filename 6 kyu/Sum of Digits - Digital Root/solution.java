public class DRoot {
    public static int digital_root(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}
