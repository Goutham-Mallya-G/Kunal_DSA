package First_java;


import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        int p = in.nextInt();
        System.out.print("Enter the time: ");
        int t = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = in.nextInt();
        System.out.println("Simple Interest is " + (p * t * r) / 100);
    }
}