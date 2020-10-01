class Solution {
    public static int solve(int [] arr) {
        int result = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                result++;
            }
        }
        return result;
    }
}
