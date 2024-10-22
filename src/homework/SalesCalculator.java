package homework;
/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class SalesCalculator {

    // Get input from user and calling both static methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character
        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate commission based on sales amount
        double commission = calculateCommission(salesAmount);

        // Print out the details
        printSalesDetails(salesId, sellerName, salesAmount, basicSalary, commission);
    }

    // Method to calculate sales commission based on the amount
    public static double calculateCommission(double salesAmount) {
        if (salesAmount >= 50000) {
            return salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            return salesAmount * 0.05;
        } else {
            return salesAmount * 0.02;
        }
    }

    // Method to print the sales details
    public static void printSalesDetails(int salesId, String sellerName, double salesAmount, double basicSalary, double commission) {
        System.out.println("__________________________________");
        System.out.println("|         Sales Details           |");
        System.out.println("|_________________________________|");
        System.out.printf("| Sales ID       : %-13d |\n", salesId);
        System.out.printf("| Seller's Name  : %-13s |\n", sellerName);
        System.out.printf("| Sales Amount    : %-13.2f |\n", salesAmount);
        System.out.printf("| Basic Salary    : %-13.2f |\n", basicSalary);
        System.out.printf("| Commission      : %-13.2f |\n", commission);
        System.out.println("|_________________________________|");
    }
}

