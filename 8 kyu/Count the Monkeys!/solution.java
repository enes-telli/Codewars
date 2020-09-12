public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        int[] array = new int[n];
        for(int i = 0; i < n;) {
            array[i] = ++i;
        }
        return array;
    }
}
