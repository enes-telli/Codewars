import java.util.ArrayList;

public class FindOutlier{
    static int find(int[] integers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i : integers)
        {
            if(i % 2 == 0)
                even.add(i);
            else
                odd.add(i);
          
            if(even.size() > 1 && odd.size() > 0)
                return odd.get(0);
            if(even.size() > 0 && odd.size() > 1)
                return even.get(0);
        }
        return even.size() == 1 ? even.get(0) : odd.get(0);
    }
}
