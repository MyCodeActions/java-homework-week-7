package homework;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class AverageOfArray {

    // Method to calculate the sum of the array elements and // Using for loop to iterate over the elements
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


    // Method to calculate the average of the array elements
    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length; // Cast to double for accurate average
    }


    // Declare an integer array and initialize it with values and calling the calculateAverage method and store the result
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        double average = calculateAverage(numbers);
        System.out.println("Average value of the array elements is: " + average);
    }
}
