package se.labb2_junit;

import java.util.Scanner;

public class Calculator {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean repeat = true;

    public static void main(String[] args) {

        while (repeat) {
            System.out.println("choose from the menu ");
            System.out.println("1: addition\n2: subtraction\n3: multiplication\n4: division\n");
            int n;
            n = scanner.nextInt();

            System.out.println("enter first number: ");
            int x = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter second number: ");
            int y = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1:
                    addition(x, y);
                    break;
                case 2:
                    subtraction(x, y);
                    break;
                case 3:
                    multiplication(x, y);
                    break;
                case 4:
                    division(x, y);
                    break;
            }
            System.out.println("do you want to do it again");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes"))
                repeat = true;
            else
                repeat = false;
        }
    }

    public static int addition(int x, int y) {
        int result = x + y;
        //System.out.println("the sum of the numbers is : " + result);
        repeat = true;
        return result;

    }

    public static int subtraction(int x, int y) {
        int result = x - y;
        System.out.println("the difference is: " + result);
        repeat = true;
        return result;

    }

    public static int multiplication(int x, int y) {
        int result = x * y;
        System.out.println("product is : " + result);
        repeat = true;
        return result;

    }

    public static float division(int x, int y) {
        int result = 0;
        if (y != 0) {
            result = x / y;
            System.out.println("the result is " + result);
        } else
            System.out.println("mathematical error");
        repeat = true;
        return result;
    }


}
