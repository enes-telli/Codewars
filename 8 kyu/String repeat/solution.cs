namespace Solution
{
    public static class Program
    {
        public static string RepeatStr(int n, string s)
        {
            string result = "";
            for (int i = 0; i < n; i++)
                result += s;
            return result;
        }
    }
}
