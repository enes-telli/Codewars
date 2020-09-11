import java.util.ArrayList;

public class FindOdd {
    public static int findIt(int[] a) {
        ArrayList numbers = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++)
        {
            if(numbers.contains(a[i]))
            {
                numbers.remove(numbers.indexOf(a[i]));
            }
            else
            {
                numbers.add(a[i]);
            }
        }
        return (int) numbers.get(0);
    }
}
