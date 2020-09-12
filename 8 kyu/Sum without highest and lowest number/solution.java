public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2)
            return 0;
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int i : numbers) {
            if (i < min)
                min = i;
            else if (i > max)
                max = i;
            sum += i;
        }
        return sum - max - min;
    }
}
