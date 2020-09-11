public class Kata {
    public static String highAndLow(String numbers) {
        String[] a = numbers.split(" ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(String i : a)
        {
            if(Integer.parseInt(i) < min)
            {
                min = Integer.parseInt(i);
            }
            if(Integer.parseInt(i) > max)
            {
                max = Integer.parseInt(i);
            }
        }
        return max + " " + min;
    }
}
