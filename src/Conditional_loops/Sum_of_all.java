package Conditional_loops;

import java.util.Scanner;

public class Sum_of_all {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            sum += n;
            System.out.print("Enter the number : ");
            n = in.nextInt();
        }
        System.out.println(sum);
    }
}
