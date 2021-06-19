package ciccc.functions;

public class Functions {
    public static String stringToBinary(String str){
        char[] chars = str.toCharArray();
        StringBuilder binary =  new StringBuilder();
        for(char ch:chars){
            binary.append(Integer.toBinaryString(ch));
        }
        return String.valueOf(binary);
    }

    public static int sumBinary(String binary){
        char[] chars = binary.toCharArray();
        int sum=0;
        for(char ch:chars){
            sum+= Character.getNumericValue(ch);
        }
        return sum;
    }

    public static String caesarCipher(String str, int rotation){
        char[] chars = str.toCharArray();
        StringBuilder encripter = new StringBuilder();
        for(char ch:chars){
            int aux = ch;
            int ascii=0;
            if((aux+rotation)>255){
                int dif = (aux+rotation)-255;
                ascii=dif;
            }
            else{
                ascii=aux+rotation;
            }
            char valueAscii = (char)ascii;
            //System.out.println("valueAscii: " + valueAscii);
            encripter.append(valueAscii);
        }
        return String.valueOf(encripter);
    }
}
