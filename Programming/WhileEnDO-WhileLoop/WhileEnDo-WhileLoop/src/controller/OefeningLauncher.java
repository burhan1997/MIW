package controller;

import java.util.Scanner;

public class OefeningLauncher {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        final int MAX = 10;
//        final int MIN = 1;
//        int random = (int)((Math.random()*(MAX - MIN + 1))+MIN);
//
//        while (random != MAX){
//            System.out.println(random);
//            random = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
//        }
//        System.out.println("MAXIMUM (" + MAX + ") is hier!");
//
//        do {
//            System.out.println(random);
//            random = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
//        } while (random != MAX);
//        System.out.println("yuppa do while random is " + random);
//    }


       // Sum of Positive Numbers
        System.out.print("Enter an integer number: ");
        int num = input.nextInt();
        int sum = 0;

        while(num>0){
            sum = sum + num;
            System.out.println("Current sum: " + sum);
            System.out.print("Enter another number: ");
            num = input.nextInt();
        }
        System.out.println("Final total sum: " + sum);

        // * Problem: Factorial Calculation
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return; // Exit the program
        }

        // Factorial calculation using a while loop
        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i; // Multiply factorial by i
            i++; // Increment i by 1
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        }


    }

