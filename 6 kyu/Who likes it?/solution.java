class Solution {
  
    public static String whoLikesIt(String... names) {
        String result = "";
        if(names.length == 0)
            result = "no one likes this";
        else if(names.length == 1)
            result = names[0] + " likes this";
        else if(names.length == 2)
            result = names[0] + " and " + names[1] + " like this";
        else if(names.length == 3)
            result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else
            result = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        return result;
    }
    
}
