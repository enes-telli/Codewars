using System.Collections.Generic;
using System.Linq;

public class Kata
{
    public static int[] ArrayDiff(int[] a, int[] b)
    {
        List<int> resultList = a.ToList();
        
        for (int i = a.Length - 1; i >= 0; i--)
        {
            for (int j = 0; j < b.Length; j++)
            {
                if (resultList[i] == b[j])
                {
                    resultList.RemoveAt(i);
                    break;
                }
            }
        }
      
        return resultList.ToArray();
    }
}
