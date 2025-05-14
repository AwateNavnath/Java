class Calculation
{ 
   int a, b;
  public Multiplication(){
       this.a= 1;
       this.b= 2;
       }
  public Multiplication(int x,int y)
    {
         this.a = x;
         this.b = y;
     }
 //public getMult(int a,int b )
  //{
    // return this.a * this.b;
  //}
void display()
 {
   System.out.println("This multiplication two number " + a * b);

 }
public static void main(String [] args)
 {
   Multiplication n = new Multiplication();
   Multiplication t = new Multiplication(3,4);
   t.display();
 }

}

  