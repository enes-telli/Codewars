public class Positive{

    public static int sum(int[] arr){
        int sum = 0;
        for(int x : arr)
        {
           sum += x > 0 ? x : 0;
        }
        return sum;
    }

}
