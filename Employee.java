class Employee
{  
   
      private String name;
      private double salary;
 
     
      public Employee( String  name, double salary)
       {
         
         this.name = name;
         this.salary = salary;
       }
  void display()
    { 
       
       System.out.println("Employee Name " + name);
       System.out.println("Employee salary " + salary);
     }
  }
class Bonus extends Employee
{
       private double bonus;
     
    public Bonus(String name ,double salary,double bonus)
        {
          super(name , salary);
          this.bonus = bonus;
          
         }
   public void display()
     {
      super.display();
      System.out.println("Bonus: $" + bonus) ;
     }
}
    class main {
   public static void main(String[] args)
    {
          
         Employee Bonus = new Bonus ("Nvanath",  1000 );
           Bonus.display();
     }
  }



 

    