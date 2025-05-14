class Circle {
    public double radius ;
    final static double PI = 3.14;
     
    public  Circle()
     {
      this.radius = 1;
     }
    public Circle(double r )
    {
       this.radius = r;
    }
    public double getRadius()
    {
       return this.radius ;
     }
    public void setRadius(double r)
    {
       this.radius = r;
    }
   public  double computeArea()
    {
      return PI*this.radius*this.radius;
    }
   void Display()
   {
        System.out.println("Area of the circle : " + computeArea()) ; 
  }
}
class MyCylinder extends Circle {
       double height;
   public MyCylinder()
     {
       super();
       this.height=1;
      }
   public MyCylinder(double r , double h)
    {
        super(r);
        this.height = h;
     }
   public void setHeight(double h)
     {
         this.height = h;
       }
   public double getHeight()
      {
          return this.height;
       }
   public double computeVolume()
    {
         return (computeArea() * this.height);
     }
   public double computeArea()
       {
            return 2 *(super.computeArea() + (PI * getRadius() * getHeight()));
        }
public static void main(String[] args)
       {
             MyCylinder c1 = new MyCylinder();
             MyCylinder c2 = new MyCylinder(2,4);
             System.out.println("Radius = " + c1.getRadius());
             System.out.println("Hegiht = " + c1.getHeight());
             System.out.println("Volume = " + c1.computeVolume());
             System.out.println("Radius = " + c2.getRadius());
             System.out.println("Height = " + c2.getHeight());
             System.out.println("Volume = " + c2.computeVolume());
        }
   }

   
   
       
         
    
   
   