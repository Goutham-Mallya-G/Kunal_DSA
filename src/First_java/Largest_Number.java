package First_java;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println("Num 1 is larger");
        }
        else{
            System.out.println("Num2 is larger");
        }
    }
}
