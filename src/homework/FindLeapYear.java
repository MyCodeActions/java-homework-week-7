package homework;
/**
 * 2.Write a java program to input any year like ex.2007 and find out if it is leap year or not?
 */

import java.util.Scanner;

public class FindLeapYear {

    static int year;

    // Get input from user and calling LeapYear method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        year = scanner.nextInt();
        LeapYear();
        scanner.close();
    }

    // declaring isLeapYear method and written logic for leapyear
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    //  Method to determine if the year is a leap year and print the result
    public static void LeapYear() {
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


