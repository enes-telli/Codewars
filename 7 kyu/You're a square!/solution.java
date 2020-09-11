public class Square {    
    public static boolean isSquare(int n) {        
        return ((Math.sqrt(n) - Math.floor(Math.sqrt(n))) == 0);
    }
}
