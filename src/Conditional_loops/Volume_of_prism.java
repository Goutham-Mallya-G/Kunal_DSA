package Conditional_loops;

import java.util.Scanner;

public class Volume_of_prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = in.nextInt();
        System.out.print("Enter the height : ");
        int height = in.nextInt();
        System.out.println("Volume of prism is " + base * height );
    }
}
