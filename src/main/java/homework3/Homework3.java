package homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

       //task 1

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second number:");
        b = scanner.nextInt();
        System.out.println("Enter the third number:");
        c = scanner.nextInt();
        if(a > b && b > c)
        {
            System.out.println("Largest number is: " + a);
        }
        else if(b > c)
        {
            System.out.println("Largest number is: " + b);
        }
        else
        {
            System.out.println("Largest number is: " + c);
        }

    }
}



