using System.Collections.Generic;

public static class Kata
{
    public static int sumTwoSmallestNumbers(int[] numbers)
    {
        int min1 = numbers[0];
        int min2 = numbers[1];
      
        if (min2 < min1)
        {
            min1 = numbers[1];
            min2 = numbers[0];
        }
        
        for (int i = 2; i < numbers.Length; i++)
        {
            if (numbers[i] < min1)
            {
                min2 = min1;
                min1 = numbers[i];
            }
            else if (numbers[i] < min2)
            {
                min2 = numbers[i];
            }
        }
        return min1 + min2;
    }
}
