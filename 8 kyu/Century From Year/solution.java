public class Solution {
    public static int century(int number) {
        return number % 100 == 0 ? number / 100 : number / 100 + 1;
    }
}
