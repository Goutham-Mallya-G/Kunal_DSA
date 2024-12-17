package Conditional_loops;

import java.util.Scanner;

public class Leetcode_1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter te number : ");
        int n = in.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
//            int num = n;
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        System.out.println(product - sum);
    }
}
