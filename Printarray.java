/* Write a java program to create an array of strings. Implement a method printArray 
that takes the array as an argument and prints each element on a new line.
Demonstrare this method with an array of  at least 5 element.*/

public class Printarray {

    public static void main(String[] args) {
        
        String[] array = {
            "Apple",
            "Banana",
            "Cherry",
            "Date"
        };

       
        printArray(array);
    }

    
    public static void printArray(String[] array) {
        
        for (String element : array) {
            System.out.println(element);
        }
    }
}


    
 
          