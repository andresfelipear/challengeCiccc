package ciccc.main;

import ciccc.functions.Functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Functions functions = new Functions();
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = console.next();
        String emailBinary = functions.stringToBinary(email);
        int sumBinary = functions.sumBinary(emailBinary);
        System.out.println("Your email " + email + " to binary is "+ emailBinary);
        System.out.println("The sum of binary digits is: "+ sumBinary );
    }
}
