package Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the Triangle : ");
        int side = in.nextInt();
        System.out.println("Perimeter of the equilateral triangle is : "+ 3* side);
    }
}
