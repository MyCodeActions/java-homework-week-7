package homework;

/**
 * 18. Write a Java program to sum values of an array
 */
public class SumOfArray {

    // Method to calculate the sum of array elements uisng for-each loop
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i; // Adding each element to the sum
        }
        return sum;
    }

    // Declare and initialize an integer array and call the calculateSum method and pass the array
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = calculateSum(my_array);
        System.out.println("The sum is " + sum);
    }
}

