public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        if(op == "+")
            return v1 + v2;
        else if(op == "-")
            return v1 - v2;
        else if(op == "*")
            return v1 * v2;
        else if(op == "/")
            return v1 / v2;
        return 0;
    }
}
