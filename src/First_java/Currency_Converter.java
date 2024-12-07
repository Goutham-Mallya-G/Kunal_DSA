package First_java;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Currency_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter INR : ");
        int inr = in.nextInt();
        System.out.println("USD :" + inr*0.012);
    }
}
