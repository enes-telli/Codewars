class Persist {
    public static int persistence(long n) {
        int result;
        int counter = 0;
        while(n > 9)
        {
            result = 1;
            while(n > 0)
            {
                result *= n % 10;
                n /= 10;
            }
            counter++;
            n = result;
        }
        return counter;
    }
}
