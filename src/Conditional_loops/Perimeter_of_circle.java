package Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = in.nextInt();
        System.out.println("Perimeter of the Circle is "+ 2 * (Math.PI) * radius);
    }
}
