using System.Collections.Generic;

public static class Kata
{
    public static string AlphabetPosition(string text)
    {
        text = text.ToUpper();
        List<int> numbers = new List<int>();
        for (int i = 0; i < text.Length; i++)
        {
            if (text[i] >= 65 && text[i] <= 90)
            {
                numbers.Add(text[i] - 64);
            }
        }
        return string.Join(" ", numbers);
    }
}
