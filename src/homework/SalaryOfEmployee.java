package homework;
/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class SalaryOfEmployee {

    static double hra, da, ta, pf, grossSalary, basicSalary;
    static int empId;
    static String empName;


    // Get input from user and Call static method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = scanner.nextDouble();
        scanner.close();

        salaryCalculation();
    }

    // Method for calculation HRA, TA, DA, PF, Gross Salary
    public static double salaryCalculation() {

        hra = basicSalary * 0.10;
        da = basicSalary * 0.08;
        ta = basicSalary * 0.09;
        pf = basicSalary * 0.20;
        grossSalary = basicSalary + hra + ta + da - pf;

        // Print the Salary Slip in the required format
        System.out.println("_______________________________");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.printf("| Employee Id   : %-13d |\n", empId);
        System.out.printf("| Employee Name : %-13s |\n", empName);
        System.out.println("|______________________________|");
        System.out.printf("| Basic Salary  : %-13.1f |\n", basicSalary);
        System.out.printf("| HRA 10%%      : %-13.1f |\n", hra);
        System.out.printf("| TA 9%%        : %-13.1f |\n", ta);
        System.out.printf("| DA 8%%        : %-13.1f |\n", da);
        System.out.printf("| PF - 20%%     : %-13.1f |\n", pf);
        System.out.println("|______________________________|");
        System.out.printf("| Gross Salary  : %-13.1f |\n", grossSalary);
        System.out.println("|==============================|");

        return grossSalary;
    }
}

