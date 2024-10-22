package homework;
/**
 * 9. Same as program-8 using switch statement
 */

import java.util.Scanner;

public class CityNameBySwitch {

    static char alphabet;

    // Creating object, get input from user alphabet from A to F and calling instance cityName method
    public static void main(String[] args) {
        CityNameBySwitch obj = new CityNameBySwitch();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F: ");
        alphabet = scanner.next().toUpperCase().charAt(0); // Convert to uppercase for uniformity
        obj.cityName();
        scanner.close();
    }

    // Method for determine the city name based on the alphabet
    public void cityName() {
        switch (alphabet) {
            case 'A':
                System.out.println("City Name: Ahmedabad");
                break;
            case 'B':
                System.out.println("City Name: Berlin");
                break;
            case 'C':
                System.out.println("City Name: Chicago");
                break;
            case 'D':
                System.out.println("City Name: Dubai");
                break;
            case 'E':
                System.out.println("City Name: Echt");
                break;
            case 'F':
                System.out.println("City Name: Florence");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet from A to F");
                break;
        }
    }
}
