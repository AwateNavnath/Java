import java.util.Scanner;

class EM
{
        private int id;
        private String name;
        private String dept;
        private int salary;
    
        public EM()
       {
             this.id = 0;
             this.name = "";
             this.dept = "";
             this.salary = 0;
        }
       public EM(int id,String name, String dept, int salary)
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
            System.out.print("Enter Name: ");
            this.name = sc.nextLine();

            System.out.print("Enter Department: ");
            this.dept = sc.nextLine();
 
            System.out.print("Enter Salary: ");
            this.salary = sc.nextInt();
          }
          
      void display()
       {
              System.out.println("Id: " + this.id);
              System.out.println("Name: " + this.name);
              System.out.println("Department:" + this.dept);
              System.out.println("Salary: " + this.salary);
        }
       public int getSalary()
        {
            return this.salary;
         } 
}

class Managers extends EM
{
      protected int bonus;
        
      public Managers()
     {
           super();
           this.bonus = 0;
      }
   
      public Managers(int i, String n, String d, int s, int bonus)
      {
            super(i,n,d,s);
            this.bonus = bonus;
       }
  
      public void accept()
     {
           super.accept();
           Scanner sc = new Scanner(System.in);
          
           System.out.print("Enter Bonus: ");
           this.bonus = sc.nextInt();
       
      }
    
     public int getTotal()
     {
           return ( getSalary()  + this.bonus);
      }
 
      
     void display()
     {  
              super.display();
              
              System.out.println("Bonus : " + this.bonus);
              System.out.println("Total Salary: " + getTotal());
        }
   public static void main(String[] args)
      {
            Scanner sc  = new Scanner(System.in);
                 
            System.out.println("How many managers?");
            int n =  sc.nextInt();

            Managers arr[] = new Managers[n];

            // Accept n managers
            for(int i =0 ; i<n; i++)
            {
                   arr[i] = new Managers();
                   arr[i].accept();
             }
            // Display all Managees
            for(int i = 0; i< n ; i++)
            {
                  arr[i].display();
             }
             
           // Display manager of max salary
            int max = arr[0].getTotal();
           // Manager max = new Managers();
            int index = 0; 
 
          for(int i = 1; i < n; i++)
          {  
              // totalsalary = arr[i].getTotal();
               if(max < arr[i].getTotal())
               {
                    max  =  arr[i].getTotal();
                    index = i;
                 }
          }

          System.out.println("Details of manager with maximum Total Salary is: ");
          arr[index].display();
        }
}

               
          
                 