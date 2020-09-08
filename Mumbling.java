/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumbling;

/**
 *
 * @author Enes Telli
 */
public class Mumbling {

    public static String accum(String s) {
        s = s.toLowerCase();
        String result = "";
        for (int i = 0; i < s.length(); i++) 
        {
            result += s.substring(i, i + 1).toUpperCase();
            for (int j = 0; j < i; j++) 
            {
                result += s.charAt(i);
            }
            result += "-";
        }

        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        String a = "asdasd";
        System.out.println(accum(a));
    }

}
