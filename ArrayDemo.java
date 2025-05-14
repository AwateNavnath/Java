

import java.util.*;

class ArrayDemo {
    public static void main(String[] args) {
        int i, n;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Length (max 5): ");
        n = sc.nextInt();

        // Ensure n does not exceed the array length
        if (n > 5) {
            System.out.println("Length exceeds array size. Please enter a value up to 5.");
            return;
        }

        for (i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "]:");
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        
    }
}
