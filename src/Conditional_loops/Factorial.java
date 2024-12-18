package Conditional_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int factorial = 1;
        while (n>0){
            factorial*=n;
            n-=1;
        }
        System.out.println(factorial);
    }
}
