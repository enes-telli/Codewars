class Solution{
    public static int [] nameValue(String [] arr){
        int size = arr.length;
        int[] numbers = new int[size];
        int sum;
        for(int i = 0; i < size; i++)
        {
            sum = 0;
            for(int j = 0; j < arr[i].length(); j++)
            {
                if(arr[i].charAt(j) != ' ')
                sum += ((int) arr[i].charAt(j)) - 96;
            }
            numbers[i] = sum * (i + 1);
        }
        return numbers;
    }
}
