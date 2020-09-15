public class Sum {
    public int GetSum(int a, int b) {
        int min = a < b ? a : b;
        int max = a > b ? a : b;
        int sum = 0;
        for(int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
