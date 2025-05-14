import java.until.Scanner;

class Employee
{
       private int id;
       private String name;
       private String dept;
       private int Salary;
   
       public Employee()
      {
            this.id = 0;
            this.name = "";
            this.dept = "";
            this.Salary = 0;
      }
    
       public Employee(int id, String name, String dept, int salary)
      {
              this.id = id;
              this.name = name;
              this.dept = dept;
              this.salary = salary;
       }
       
        public void accept()
       {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID: ");
            this.id = sc.nextInt();
               
            this.name = sc.nextLine();
           
            System.out.print("Enter Departement: ");
            this.dept = sc.nextLine();
           
            System.out.print("Enter Salary: ");
            this.salary = sc.nextInt();
        
         }
         
         void display()
         {
                   System.out.println("Id: " + this.id);
                   System.out.println("Name: " this.name);
                   System.out.println("Deparment: " + this.dept);
                   System.out.println("Salary: " + this.salary);
           }
      
           public int getSalary()
           {
                   return this.salary;
           } 
  }
class Managers extends Employee
{
       private int bonus;

       public Managers()
        {
              super();
              this.bonus = 0;
           }
         public Managers(int i ,String n, String d , String s , int bonus)
        {
              super( i, n, d, s);
              this.bonus = bonus;
         }
         public void accept()
         {
              super.accept();
              Scanner sc =  new Scanner(System.in);
       
              System.out.print("Enter Bonus: ");
              this.bonus = sc.nextInt();
          }
           
          public int getTotal()
          {
                   return (getSalary() + this.bonus);
           }
          void display()
        {
               super.display();
         
               System.out.println("Bonus: " +this.bonus);
               System.out.println("Total Salary: " + getTotal());
           }
            
         public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
               
             System.outprintln("How many managers?");
             int n = sc.nextInt();
            
             Manager m[] = new Managers[n];

            // Accept n managers
           for(int i = 0; i < n; i++)
             {
                   m[i] = new Managers();
                   m[i].accept();
             }
    
           // Display all Managers
          for(int i = 0; i< n ; i++)
           {
                  m[i].display();
            }
              
           // Display manager of max salary
           int max  = m[0].getTotal();
          // Manager max = new Managers();
           int index  = 0;
    
          for(int i =1; i< n; i++)
           {
                   // totalsalary = m[i].getTotal(); 
                   if(max < m[i].getTotal())
                   {
                         max  = m[i].getTotal();
                         index  = i;
                   }
             }
              
              System.out.println("Detali of manager with maximum total salary is : ")
              m[index].display();
              }
 }
                          
 
 
