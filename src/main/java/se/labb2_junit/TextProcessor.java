package se.labb2_junit;

import java.util.Scanner;

public class TextProcessor {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean loop = true;

    public static void main(String[] args) {
        while (loop) {
            System.out.println("enter a string");
            String input = scanner.nextLine();
            System.out.println("choose from menu below \n1. upperToLower \n2. LowerToUpper " +
                    "\n3. find Character at position");

            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    upperToLower(input);
                    break;
                case 2:
                    lowerToUpper(input);
                    break;
                case 3:
                    System.out.println("enter position");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    charAtGivenPos(input, pos);
                    break;
            }
            System.out.println("do you want to try");
            String chooses = scanner.nextLine();

            if (chooses.equalsIgnoreCase("yes"))
                loop = true;
            else loop = false;
        }
    }

    public static String upperToLower(String input) {
        String inputToLower = input.toLowerCase();
        // System.out.println(inputToLower);
        return inputToLower;
    }

    public static String lowerToUpper(String input) {
        String inputToUpper = input.toUpperCase();
        //System.out.println(inputToUpper);
        return inputToUpper;
    }

    public static char charAtGivenPos(String input, int pos) {

        //  System.out.println("the character at position " + pos + " is " + input.charAt(pos));
        return input.charAt(pos);
    }
}
