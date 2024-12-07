package First_java;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Enter the index of fibonacci : ");
        int n = in.nextInt();
        int index = n;
        while(n-2>0){
            int temp = b;
            b = a+b;
            a = temp;
            n--;
        }
        System.out.println(index + "th fibonacci number is : " + b);
    }
}
