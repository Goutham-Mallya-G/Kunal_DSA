package Conditional_loops;

import java.util.Scanner;

public class Volume_of_cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = in.nextInt();
        System.out.print("Enter the height : ");
        int height = in.nextInt();
        System.out.println("Volume of cone is " + Math.PI* Math.pow(radius,2)*(height/3));
    }
}
