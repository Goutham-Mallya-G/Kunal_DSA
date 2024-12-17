package Conditional_loops;

import java.util.Scanner;

public class Area_of_cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = in.nextInt();
        System.out.print("Enter the height : ");
        int height = in.nextInt();
        System.out.println("Curved surface area of cylinder is " + 2 * Math.PI * radius*(height+radius));
    }
}
