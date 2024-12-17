package First_java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start = in.nextInt();
        System.out.print("Enter the ending number : ");
        int end = in.nextInt();
        for (int i = start; i <= end ; i++) {
            int sum = 0;
            int num = i;
            while(num > 0 ){
                int rem = num % 10;
                int cube = rem*rem*rem;
                sum += cube;
                num = num /10;
            }
            if(sum == i) {
                System.out.print(sum + " ");
            }
        }
    }
}
