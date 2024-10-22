package homework;
/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class CheckInputType {

    static String input;

    // Input a single character from the user and call static method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        input = scanner.nextLine();
        scanner.close();
        valueIs();
    }

    // Declaring static method for determine if the character is a number, alphabet, or symbol
    public static void valueIs() {
        if (input.length() != 1) {
            System.out.println("Please enter a single character.");
        } else {
            char character = input.charAt(0);
            if (Character.isDigit(character)) {
                System.out.println("The input is a number.");
            } else if (Character.isLetter(character)) {
                System.out.println("The input is an alphabet.");
            } else {
                System.out.println("The input is a symbol.");
            }
        }
    }
}
