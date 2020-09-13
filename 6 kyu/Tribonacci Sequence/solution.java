public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0)
            return new double[]{};
        double[] result = new double[n];
        int len = n < 3 ? n : s.length;
        
        for(int i = 0; i < len; i++) {
            result[i] = s[i];
        }
        
        for(int i = len; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result;
    }
}
