class Cylinder 
{
   private double radius;
   private double height;
   final static double pi = 3.14;
   public Cylinder() // No Arg constructor
   {
          this.radius = 1;
          this.height = 1;
    }
   public Cylinder( double r , double h )
       {
       this.radius = r;
       this.height = h;
      }
   void setRadius(double r)
       {
        this.radius = r;
        }
   void setHeight(double h)
      {
       this.height = h;
       }
   double getRadius()
   {
       return this.radius ;
    }
   double getHeight()
    {
       return this.height ;
    }
   double computevolume()
   {
       return ( pi * this.radius * this.radius*this.height);
   }
   public static void main(String[] args)
   {
           Cylinder c1 = new Cylinder();
           Cylinder c2 = new Cylinder(3,4); 
           System.out.println("Radius of Cylinder " + c1.getRadius());
           System.out.println("Height of Cylinder " + c1.getHeight());
           System.out.println("Volume of the Cylinder " + c1.computevolume());

           System.out.println("Radius of Cylinder " + c2.getRadius());
           System.out.println("Height of Cylinger " + c2.getHeight());
           System.out.println("volume of Cylinnder " + c2.computevolume());
   }//main
} //class

       
 

 
