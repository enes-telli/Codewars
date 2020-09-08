/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.pkg18.pkg214.silly.addition;

/**
 *
 * @author Enes Telli
 */
public class SillyAddition {

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
    
    public static void main(String[] args) {
        System.out.println(SillyAddition.add(592,1376));
    }
    
}
