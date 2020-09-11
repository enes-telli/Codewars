public class SquareDigit {

    public int squareDigits(int n) {
        String result = "";
        for(String s : Integer.toString(n).split(""))
        {
            result += (int)Math.pow(Integer.parseInt(s), 2);
        }
        return Integer.parseInt(result);
    }

}
