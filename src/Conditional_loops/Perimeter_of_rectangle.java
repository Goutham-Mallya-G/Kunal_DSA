package Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = in.nextInt();
        System.out.print("Enter the width : ");
        int width = in.nextInt();
        System.out.println("Perimeter of the rectangle is "+ 2*(length + width));
    }
}
