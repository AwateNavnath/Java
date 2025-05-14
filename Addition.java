class Addition{
int i,j,k;
    void add(int a){
     i=a;
    System.out.println("add i ="+i);
   }
void add(double a, double b){ //overloaded add()
    System.out.println("add a+b = "+(a+b));
  }
void add(int a,int b,int c){ // overloaded add()
    i=a;
    j=b;
    k=c;
   System.out.println("add i+j+k="+(i+j+k)); 
  }
} 
class OverloadDemo{
public static void main(String [] args){
   Addition a1= new Addition();
   // class all versions of add()
     a1.add(20);
     a1.add(30,50);
     a1.add(10,30,60);
     a1.add(30.50,67.45);
  }
}
 