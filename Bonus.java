/* Write a java program to create a base class Employee with a method calculateSalary(). then, crate a base Employee with a method calculate Salary(). then , create subclasses FullTime Employee and PartTimeEmployee, each overriding the calculateSalary() method with different implementation for calculating salary. Create instances of both types and use dynamic method disatch to print the salary for each employee using a Employee reference.*/
class Employee 
 {
         public void calculateSalary()
         {
            System.out.println("Calculating the Salary of Employee...");
          }
    }
 
class FullTimeEmployee extends Employee 
{
            int salary, bonus;
      
            public FullTimeEmployee()
            {
                 this.salary = 0;
                 this.bonus = 0;
             }
         
       public FullTimeEmployee(int salary , int bouns)
          {
               this.salary = salary;
               this.bonus = bonus;
           }
 
       public int getTotalSalary()
       {
             return(this.salary + this.bonus);
        }
 
        public void calculateSalary()
        {
               System.out.println("Full Time salary = " + getTotalSalary());
           }

        public void display()
        {
              System.out.println("Salary = "+this.salary);
              System.out.println("Bonus = " +this.bonus);
              System.out.println("Total Salary = " +getTotalSalary());
        }
    }

class PartTimeEmployee extends Employee
  {
         int perHourSalary,hours;
       
          public PartTimeEmployee()
       {
              this.perHourSalary = 0;
              this.hours = 0;
         }
        
       public PartTimeEmployee(int perHourSalary, int hours)
     {
          this.perHourSalary = perHourSalary;
          this.hours = hours;
         }
        
  public int getSalary()
    {
             return (this.perHourSalary * this.hours);
     }
  public void calculateSalary()
   {
      System.out.println("Total Salary = " +getSalary());
      } 
 
     public void display()
    {
        System.out.println("Per Hour Salary = " +this.perHourSalary);
        System.out.println("Hours = " + this.hours);
        System.out.println("Total Salary = "+getSalary()); 
   }
}

class Main {
  public static void main(String[] args) {
         FullTimeEmployee fullTimeEmp = new FullTimeEmployee(50000,5000);
         System.out.println("FullTime - Employee Details:");
         fullTimeEmp.display();
         fullTimeEmp.calculateSalary();
         System.out.println();
 
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(20,80); 
        System.out.println("Part-Time Employee Details:");
        partTimeEmp.display();
        partTimeEmp.calculateSalary();
    }
}
     
 