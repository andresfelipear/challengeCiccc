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
}