import java.util.*;
class Array2Demo{
public static void main(String[] args) {
        int size;
        int a[][],b[][],c[][];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        size=sc.nextInt();

        a=new int[size][size];
        System.out.println("Enter array elements:");
      
        for(int i=0;i<a.length;i++){
          for(int j=0; j<a.length;j++){
              System.out.println("Enter a["+i+"]["+j+"]:");
              a[i][j] = sc.nextInt();
      }
   }
     b=new int[size][size];
      for(int i =0; i<b.length;i++){
       for(int j=0;j<b.length;j++){
       System.out.println("Enter b["+i+"]["+j+"]:");
       b[i][j]=sc.nextInt();
      }
    }
     c=new int[size][size];
       for(int i=0;i<c.length;i++){
        for(int j=0;j<c.length;j++){
        System.out.println("c["+i+"]["+j+"]:"+(a[i][j]+b[i][j]));
         }
       System.out.println();
     }
   }
}













   