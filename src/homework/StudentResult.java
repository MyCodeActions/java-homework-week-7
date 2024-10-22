package homework;
/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,%> = 60 A,
 * %> = 50 B, %> = 35 C And print Mark Sheet.
 */

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll No : ");
        int rollNo = scanner.nextInt();

        // Input and validate marks for each subject
        int mathMarks = getValidMarks(scanner, "Math");
        int scienceMarks = getValidMarks(scanner, "Science");
        int englishMarks = getValidMarks(scanner, "English");

        // Calculate total and percentage
        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = total / 3.0;
        scanner.close();

        // Determine result using if-else
        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Determine grade using if-else
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print the mark sheet
        printMarkSheet(name, rollNo, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
    }

    // Function to get and validate marks without using a loop
    private static int getValidMarks(Scanner scanner, String subject) {
        System.out.print("Enter " + subject + " Marks (0-100): ");
        int marks = scanner.nextInt();

        // Validate marks using if-else
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return getValidMarks(scanner, subject); // Recursion to re-enter marks if invalid
        }
        return marks;
    }

    // Function to print the mark sheet
    private static void printMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks,
                                       int total, double percentage, String result, String grade) {
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.printf("| Name     : %-16s |\n", name);
        System.out.printf("| Roll No  : %-16d |\n", rollNo);
        System.out.println("|_____________________________|");
        System.out.println("| Subjects : Marks             |");
        System.out.println("|_____________________________|");
        System.out.printf("| Math     : %-16d |\n", mathMarks);
        System.out.printf("| Science  : %-16d |\n", scienceMarks);
        System.out.printf("| English  : %-16d |\n", englishMarks);
        System.out.println("|_____________________________|");
        System.out.printf("| Total    : %-16d |\n", total);
        System.out.println("|_____________________________|");
        System.out.printf("| Percentage: %-15.1f |\n", percentage);
        System.out.printf("| Result   : %-16s |\n", result);
        System.out.printf("| Grade    : %-16s |\n", grade);
        System.out.println("|_____________________________|");
    }
}
