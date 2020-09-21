public class Clock {
    public static int Past(int h, int m, int s) {
        return 1000 * (h * 3600 + m * 60 + s);
    }
}
