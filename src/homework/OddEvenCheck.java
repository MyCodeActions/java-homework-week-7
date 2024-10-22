package homework;
/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class OddEvenCheck {

    static int number;

    // Get input from user and call OddEven method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scanner.nextInt();
        scanner.close();
        OddEven();
    }

    // Method t0 check if the number is even or odd
    public static void OddEven() {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
