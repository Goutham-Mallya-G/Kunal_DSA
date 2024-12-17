package Conditional_loops;

import java.util.Scanner;

public class Volume_of_pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = in.nextInt();
        System.out.print("Enter the width : ");
        int width = in.nextInt();
        System.out.print("Enter the height : ");
        int height = in.nextInt();
        System.out.println("volume of Pyramid is " + (length*width*height)/3.0);
    }
}
