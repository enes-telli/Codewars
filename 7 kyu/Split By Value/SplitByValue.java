import java.util.ArrayList;
public class Solution {
    int[] splitByValue(int k, int[] elements) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i : elements)
        {
            if(i < k)
                list1.add(i);
            else
                list2.add(i);
        }
        list1.addAll(list2);
        return list1.stream().mapToInt(i -> i).toArray();
    }
}
