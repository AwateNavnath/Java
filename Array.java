import java.util.*;
class Array{
public static void main(String [] args){
   int i,n;
   int[] a= new int[5];
   Scanner sc = new Scanner(System.in);
   System.out.printl("enter Array Length:");
   n = sc.nextInt();
   for(i=0; i<n; i++) {
        System.out.println("enter a["+i+"]:");
        a[i] = sc.nextInt();
       }
    for(i=0; i<n; i++)
             System.out.println(a[i]);
  }
}  
