package homework;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class IsArrayContains {

    // Define a method that checks if array contains a given item using for each loop
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }


    // Declaring array and initialize it with values and checking it contains the item by calling method
    public static void main(String[] args) {
        int[] my_array1 = {2, 5, 8, 3, 22, 45, 17, 99, 67};

        System.out.println(contains(my_array1, 45));
        System.out.println(contains(my_array1, 33));
    }
}
