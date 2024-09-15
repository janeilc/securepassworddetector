/*
Name: Janeil Chambers
Project Name: Password Checker
Date Started: September 5, 2024
Date Completed:
*/

import java.util.Scanner;

public class PasswordCheckerProject
{

    public static boolean atLeastEightChars(String password) {
        boolean atLeastEightChars = true;
        int length = password.length();
        if (length < 8) {
            atLeastEightChars = false;
        }
        return atLeastEightChars;
    }

    public static boolean oneUpperCase(int [] validPass) {
        boolean oneUpperCase = false;

        for(int i = 0; i < validPass.length; i++) {
            if(validPass[i] > 64 && validPass[i] < 91) {
                return true;
            }
        }
        return oneUpperCase;
    }

    public static boolean oneDigit(int[] validPass) {
        boolean oneDigit = false;
        for(int i = 0; i < validPass.length; i++) {
            if(validPass[i] > 47 && validPass[i] < 58) {
                return true;
            }
        }
        return oneDigit;
    }

    public static boolean oneSpecialChar(int [] validPass) {
        boolean oneSpecialChar = false;
        for(int i = 0; i < validPass.length; i++){
            if(validPass[i] > 32 && validPass[i] < 48 || validPass[i] > 57 && validPass[i] < 65 || validPass[i] > 90 && validPass[i] < 97 || validPass[i] > 122 && validPass[i] < 127) {
                return true;
            }
        }
        return oneSpecialChar;
    }



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String password;
        boolean atLeastEightChars, oneUpperCase, oneDigit, oneSpecialChar;

        System.out.print("Enter your password below:\n");
        password = scan.nextLine();
        int length = password.length();

        char[] validPassword = new char[password.length()]; // this is an array to check the length of the user's inputted password

        int[] validPass = new int[password.length()]; // this is an array to check if the user's inputted password contains at least one digit

        // the first element of the password is the first element of the String array

        for(int i = 0; i < password.length(); i++) {
            validPass[i] = password.charAt(i);
        }

        if (atLeastEightChars(password) == true && oneUpperCase(validPass) == true && oneDigit(validPass) == true && oneSpecialChar(validPass)) {
            System.out.println("This is a secure password");
        }else{
            System.out.println("This is not a valid password. Make sure your password contains the following: \n - At least eight characters\n - At least one number\n - At least one uppercase letter\n - At least one special character");
        }
    }
}