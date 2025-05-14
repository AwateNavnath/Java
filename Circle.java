class Circle 
{
     public  double radius;
     final static double  PI = 3.14;

 public Circle()
{
   this.radius  = 1;
}
public Circle(double r)
{
   this.radius = r;
}
double getRadius()
{
   return this.radius;
}
void setRadius(double r)
{
  this.radius = r;
}
double CalculateArea()
{
   return PI*this.radius*this.radius;
}
public static void main(String[] args)
  {
      Circle c1 =  new Circle();
      System.out.println("Radius :" +  c1.getRadius());
      System.out.println(" Area of circle : " + c1.CalculateArea());

      Circle c2 = new Circle(3);
      System.out.println("Radius :" + c2.getRadius());
      System.out.println("Area of Circle : " + c2.CalculateArea());
   }// main 
}// class

      
  
    
