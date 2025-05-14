/*2) Explain the concept of a method in java. write a java method named calculateSum that takes
two integer parameters and returns their sum. Demonstrated how to call this method from the main method of a java class. */

class Sum {
public static void main (String [] args){
    int a =  100;
    int b = 200;
   int result = calculateSum(a,b);
        
   System.out.println("The sum of " + a + " and " + b + " is : " + result );
 }

public static int  calculateSum(int x ,int y )
 {
    return x + y;
  }
}

