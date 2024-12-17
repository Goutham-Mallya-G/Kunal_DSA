package Conditional_loops;

import java.util.Scanner;

public class Volume_of_sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = in.nextInt();
        System.out.println("volume of sphere is " + (4.0/3.0)*(Math.PI)*(Math.pow(radius,3)));
    }
}
