using System;

public static class Kata
{
    public static int GetVowelCount(string str)
    {
        int vowelCount = 0;
        string vowels = "aeiou";

        for (int i = 0; i < str.Length; i++)
        {
            if (vowels.Contains(str[i]))
            {
                vowelCount += 1;
            }
        }

        return vowelCount;
    }
}
