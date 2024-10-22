package homework;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
 */
public class DivisibleBy5And3 {

    // Creating object and calling instance method
    public static void main(String[] args) {
        DivisibleBy5And3 obj = new DivisibleBy5And3();
        obj.divideBy();
    }

    // Declare instance method for division using for loop
    public void divideBy() {
        System.out.println("Numbers between 1 to 100 that are divisible by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNumbers between 1 to 100 that are divisible by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
