public class NumberFun {
    public static long findNextSquare(long n) {
        return (long) ((Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0) ? Math.pow(Math.sqrt(n) + 1, 2) : -1);
    }
}
