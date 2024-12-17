package Conditional_loops;

import java.util.Scanner;

public class Area_of_cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Side : ");
        int side = in.nextInt();
        System.out.println("Total surface area of cube is " + 6*Math.pow(side,2));
    }
}
