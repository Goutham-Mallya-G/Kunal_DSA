package First_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = in.nextLine();
        String palindrome = string.toLowerCase();
        boolean ispalindrome = true;
        for ( int i = 0 ; i < palindrome.length()/2 ; i++){
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)){
                ispalindrome = false;
                break;
            }
        }
        if (ispalindrome){
            System.out.println("The string " + palindrome + " is a palindrome");
        } else {
            System.out.println("The String " + palindrome + " is not a palindrome");
        }
    }
}
