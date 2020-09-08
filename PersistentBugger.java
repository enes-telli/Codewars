/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistent.bugger;

/**
 *
 * @author Enes Telli
 */
public class PersistentBugger {

    public static int persistence(long n) {
        int result;
        int counter = 0;
        while(n > 9)
        {
            result = 1;
            while(n > 0)
            {
                result *= n % 10;
                n /= 10;
            }
            counter++;
            n = result;
        }
        return counter;
        
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }

}
