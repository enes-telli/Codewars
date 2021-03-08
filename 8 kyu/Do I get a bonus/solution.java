public class Kata {
    public static String bonusTime(final int salary, final boolean bonus) {
        return "£" + Integer.toString(bonus ? salary * 10 : salary);
    }
}
