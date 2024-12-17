package Conditional_loops;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int radius = in.nextInt();
        double area = Math.PI*(Math.pow(radius,2));
        System.out.println( "The area of square is : " +  area);
    }
}
