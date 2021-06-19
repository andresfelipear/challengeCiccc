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
        System.out.println("Your email " + email + " to binary is "+ emailBinary);
    }
}
