/* Write a java program to crate an array of integer with 'n' elements. Populate the array with values, and then write a method findmax that takes this array as an argument and returns the maximum value from the array */

import java.util.Scanner;

public class MaxValueFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
 
       int[] array = new int[n];

     
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

     
        int max = findMax(array);


        System.out.println("The maximum value in the array is: " + max);

        
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}


          
    