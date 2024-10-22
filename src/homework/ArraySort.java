package homework;
/**
 * 17.Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        // Numeric array
        int[] numericArray = {45, 22, 89, 16, 77, 30};

        // String array
        String[] stringArray = {"Apple", "Orange", "Banana", "Mango", "Peach"};

        // Sorting the numeric array
        Arrays.sort(numericArray);

        // Sorting the string array
        Arrays.sort(stringArray);

        // Print the sorted numeric array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // Print the sorted string array
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
