public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] array = dna.toCharArray();
        for(int i = 0; i < array.length; i++) {
            switch(array[i]) {
                case 'G': array[i] = 'C'; break;
                case 'C': array[i] = 'G'; break;
                case 'A': array[i] = 'T'; break;
                case 'T': array[i] = 'A'; break;
            }
        }
        return String.valueOf(array);
    }
}
