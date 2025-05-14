import java.util.*;
class ArrayDemo1{
public static void main (String[] args){
     int n,pos=0,neg=0,z=0;
     int[] a=new int[5];
     Scanner sc = new Scanner(System.in);
     System.out.println("enter Array Length:");
     n = sc.nextInt();
     for(int i=0; i<n; i++) {
             System.out.print("enter a["+i+"]:");
             a[i] = sc.nextInt();
             if(a[i]>0)
               pos++;
             else if(a[i]<0)
                  neg++;
             else
                  z++;
     }
     System.out.println("Positive no="+pos);
     System.out.println("Negative no="+neg);
     System.out.println("zero no="+z);
     }
 }
