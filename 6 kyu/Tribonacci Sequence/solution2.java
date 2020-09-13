public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] d = new double[n];
        for(int i = 0; i < n; i++) {
            d[i] = i < 3 ? s[i] : d[i-1] + d[i-2] + d[i-3];
        }
        return d;
    }
}
