public class Sequence {
    public static int[] reverse(int n) {
        int[] array = new int[n];
        for(int i = n; i > 0; i--) {
            array[n - i] = i;
        }
        return array;
    }
}
