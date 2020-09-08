public class SillyAdditon {

    public static int add(int num1,int num2){
        
        String max = Integer.toString(num1 >= num2 ? num1 : num2);
        String min = Integer.toString(num1 >= num2 ? num2: num1);
        String result = "";
        String temp = "";
        
        for(int i = 0; i < max.length() - min.length(); i++)
        {
            temp += "0";
        }
        min = temp.concat(min);
        for(int i = 0; i < max.length(); i++)
        {
            result += Integer.parseInt("" + min.charAt(i)) + Integer.parseInt("" + max.charAt(i));
        }
        return Integer.parseInt(result);
    }
}
