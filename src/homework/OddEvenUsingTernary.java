package homework;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * Use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenUsingTernary {
    static int number;

    // get input from user using scanner and calling method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        OddOrEven();
        sc.close();
    }

    // creating odd or even number method using ternary operator
    public static void OddOrEven() {
        String msg = (number % 2 == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(msg);
    }
}

