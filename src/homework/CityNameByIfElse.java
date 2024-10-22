package homework;
/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet
 * should be invalid entry
 */

import java.util.Scanner;

public class CityNameByIfElse {

    static char alphabet;

    // Creating object, get input from user alphabet from A to F and calling instance cityName method
    public static void main(String[] args) {
        CityNameByIfElse obj = new CityNameByIfElse();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F: ");
        alphabet = scanner.next().toUpperCase().charAt(0); // Convert to uppercase for uniformity
        obj.cityName();
        scanner.close();
    }

    // Method for determine the city name based on the alphabet
    public void cityName() {
        if (alphabet == 'A') {
            System.out.println("City Name: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City Name: Berlin");
        } else if (alphabet == 'C') {
            System.out.println("City Name: Chicago");
        } else if (alphabet == 'D') {
            System.out.println("City Name: Dubai");
        } else if (alphabet == 'E') {
            System.out.println("City Name: Echt");
        } else if (alphabet == 'F') {
            System.out.println("City Name: Florence");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F");
        }
    }
}

