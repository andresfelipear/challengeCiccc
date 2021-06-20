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
        final int  STARTALPHA = 96;
        if(rotation >26){
            rotation = rotation%26;
        }
        System.out.println(rotation);
        StringBuilder encripter = new StringBuilder();
        for(char ch:chars){
            System.out.println(rotation);
            int aux = ch;
            int ascii=0;
            System.out.println(aux);
            if(aux > 122 || aux<STARTALPHA){
                ascii=aux;
            }
            else if((aux+rotation)>122){
                int dif = (aux + rotation) - 122;
                ascii = STARTALPHA + dif;
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
