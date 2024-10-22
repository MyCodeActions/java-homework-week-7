package homework;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition,
 * Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class CalculatorUsingOperator {

    static double num1, num2, result;
    static char operator;

    // Get input two numbers from user and calling static method for calculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        calculateUsingSymbol();
        scanner.close();
    }

    // Perform calculation based on the operator using if-else
    public static void calculateUsingSymbol() {
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            // Check for division by zero
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please enter +, -, * or /.");
        }
    }
}
