package Conditional_loops;

import java.util.Scanner;

public class Largest_of_all {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = in.nextInt();
        int large = 0;
        while (n > 0){
            if(n>large){
                large = n;
                System.out.print("Enter the number :");
                n = in.nextInt();
            }else{
                System.out.print("Enter the number :");
                n = in.nextInt();
            }
        }
        System.out.println("Largest number is = " + large);
    }
}
