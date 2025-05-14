import java.until.Scanner;

class Employe {
     
  private int  id;
  private String name;
  private String deparment ;
  private double   salary;
  
 public Employe()
   {
        this.id= 0 ;
        this.name = " ";
        this.deparment = " ";
        this.salary = 0;
    }
public Employe(int id, String name , String deparment , double  salary)
      {   
        this.id = id;
        this.name = name ;
        this.deparment =  deparment;
        this.salary= 0;
     }
public void accept(int id, String name, String department, double salary)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter the id ");
      id = sc.nextInt();
    
      System.out.println("please Enter the name ");
      name = sc.nextString();
     
      System.out.println("Please Enter the deparament ");
      deparment = sc.nextString();
     
      System.out.println("please Enter the salary");
      salary = sc.nextInt();
    }
 void display()  
   {   
    System.out.println(" Employee id : " + id);
    System.out.println(" Employee name : " + name);
    System.out.println(" Employee deparament " +  deparament);
    System.out.println(" Employee salary " + salary);
  } 
 public double getSalary()
   {
      return this.salary;
    } 
} 
class manager extends Employee
    {
        private double bonus ;
        public  manager()
         {
           super();
           bonus = 0;
         }
      public  manager(int id , String name, String deparment, double salary, double bonus)
       {
          super.accpet(id,name , department,salary);
          bonus = bonus;
        }
      public accept(int id ,String name , String deparament, double salary , double bonus)
       {
          super.accept();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter bonus");
          bonus = sc.nextdouble();
        }
      public double getBonus()
    {
        return this.Bonues;
      }
  public double gettotalSalary()
    {
         return (getSalary()+this.Bonues);
      }
public void display() {
        super.display();
        System.out.println("Manager Bonus : " + this.bonus);
       }
}

public Static void main(String [] args)
     {
          Scanner sc = new Scanner(System.in);
        
          System.out.println("Please enter information of how many employees you want to add : ");
          int  n = sc.nextInt();
      
         Manager[] arr = new Manager[n];
         sc.nextLine();
         System.out.println("please enter informarion of "+ n + " employees : ");
         for(int i = 0; i< n ; i++){

              arr[i] = new Manager();
              arr[i].accept;
            Employee M = new Employee(id, name ,deparment, Salary,Bonus);

       double max = arr[0].gettotalsalary();
       int k = 0;
       for(int  i= 1 ; i< n ; i++) {
                  if((max < (arr[i].gettotalsalary()))){
                      max = arr[i]gettotalsalary();
                      k = i;
                 }
       }
   System.out.println("Maximum total salary is : " + max);
   arr[k].display();
 } 
}
.jaa     
     
           

       
          
           
    

  
   