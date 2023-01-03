package homework3;

import java.time.DayOfWeek;
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
        if (a > b && b > c) {
            System.out.println("Largest number is: " + a);
        } else if (b > c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
        // task 2

        System.out.println("Insert side y: ");
        int y = scanner.nextInt();
        System.out.println("Insert side x: ");
        int x = scanner.nextInt();
        System.out.println("Perimeter = " + (x + y + x + y));
        System.out.println("Area = " + (x * y));

        //task 3
        int number;

        System.out.println("Please enter a number:");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }

        //task 4
        System.out.println("Please enter one number between 1 to 7");
        int dayOfTheWeek = scanner.nextInt();

      switch (dayOfTheWeek) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      case 3:
          System.out.println("Wednesday");
        break;
      case 4:
          System.out.println("Thursday");
        break;
      case 5:
      System.out.println("Friday");
      break;
      case 6:
          System.out.println("Saturday");
          break;
     case 7:
     System.out.println("Sunday");
     break;
      }
    }
    }









