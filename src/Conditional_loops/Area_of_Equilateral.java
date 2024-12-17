package Conditional_loops;

import java.util.Scanner;

public class Area_of_Equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = in.nextInt();
        System.out.println("Area of equilateral : "+ (Math.sqrt(3)/4)*(Math.pow(length,2)));

    }
}
