package Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int side = in.nextInt();
        System.out.println("Perimeter of square is " + 4 * side);
    }
}
