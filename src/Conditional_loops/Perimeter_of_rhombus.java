package Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int side = in.nextInt();
        System.out.println("Perimeter of Rhombus is " + 4 * side);
    }
}
