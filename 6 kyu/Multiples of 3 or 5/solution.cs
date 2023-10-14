public static class Kata
{
    public static int Solution(int value)
    {
        int result = 0;
      
        for (int i = 3; i < value; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                result += i;
            }
        }
      
        return result;
    }
}
