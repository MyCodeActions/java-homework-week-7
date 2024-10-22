package homework;
/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class NumberChecker {

    static double number;

    // Getting input from user and calling static method for check number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextDouble();
        scanner.close();
        checkNumber();
    }

    // Declaring method to check if the number is positive, negative, or zero
    public static void checkNumber() {
        if (number > 0) {
            System.out.println("The number is POSITIVE");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE");
        } else {
            System.out.println("The number is ZERO");
        }
    }
}
