package First_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1");
        int num1 = in.nextInt();
        System.out.print("Enter number 2");
        int num2 = in.nextInt();
        System.out.print("Enter the operator");
        char op = in.next().trim().charAt(0);
        if (op == '+'){
            System.out.println(num1+num2);
        }
        else if (op == '-'){
            System.out.println(num1-num2);
        }
        else if (op == '*'){
            System.out.println(num1*num2);
        }
        else if(op == '/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Invalid operator");
        }
    }
}
