public class Kata {
    public static int nthPower(int[] array, int n) {
        if (n >= array.length) 
            return -1;
        return (int) Math.pow(array[n], n);
    }
}
