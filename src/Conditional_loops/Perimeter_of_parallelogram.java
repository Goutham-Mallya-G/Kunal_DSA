package Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = in.nextInt();
        System.out.print("Enter the side : ");
        int side = in.nextInt();
        System.out.println("Perimeter of the parallelogram is "+ 2*(base + side));
    }
}
