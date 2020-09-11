public class BitCounting {
    public static int countBits(int n) {
        int result = 0;
        while(n > 0)
        {
            if(n % 2 == 1)
                result++;
            n >>= 1;
        }
        return result;
    }
}
