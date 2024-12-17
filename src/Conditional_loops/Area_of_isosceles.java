package Conditional_loops;

import java.util.Scanner;

public class Area_of_isosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the breadth : ");
        int breadth = in.nextInt();
        System.out.print("Enter the height : ");
        int height = in.nextInt();
        System.out.println("Area of Isosceles Triangle is " + breadth/2 * height);
    }
}
