package Conditional_loops;

import java.util.Scanner;

public class Area_of_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = in.nextInt();
        System.out.print("Enter the height : ");
        int height = in.nextInt();
        System.out.println("Area of Rhombus is " + base * height);
    }
}
