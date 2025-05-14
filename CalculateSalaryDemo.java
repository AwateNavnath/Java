/* Write a java program to create a base class Employee with a method calculateSalary().
Then, create subclass FullTimeEmoloyee and partTimeEmployee, each overriding the calculateSalary() method with different implementations for calculating salary. create instances of both types and use dynamic method dispatch to print the salary for calculting salary. create instances of both types and use dynamic method dispatch to print the salary for each employee using a employee reference.*/

import java.util.Scanner;

class Employee{
     private static double calculateSalary(){
                 System.out.println("Calculating the salary.");
                 return 0;
             }
}

class FullTimeEmployee extends Employee{
             public static double calculateSalary(){
                    System.out.println("please enter salary and bonus of employee");
                    double salary = CalculateSalaryDemo.sc.nextDouble();
                    double bonus = CalculateSalaryDemo.sc.nextDouble();
                   CalculateSalaryDemo.sc.nextLine();
                   System.out.print("Calculating the salary of Full Time employee and");
                    return (salary + bonus);
             }
}

class PartTimeEmployee extends Employee{
         public static double calculateSalary(){
                 System.out.println("please enter number of hours and salary per hour : ");
                double hrs =CalculateSalaryDemo.sc.nextDouble();
                double salaryPerhr =CalculateSalaryDemo.sc.nextDouble();
               CalculateSalaryDemo.sc.nextLine();
               System.out.print("calculating the salary of part Time Employee and ");
              return (hrs * salaryPerhr);
           }
}

class CalculateSalaryDemo{
   public static Scanner sc = new Scanner(System.in);//Methods can only declare local variables. 
    public static void main(String[] args) { 
          // public static Scanner sc = new Scanner(System .in); //error : illegal start of expression 
          boolean conti = false;
          do{
            System.out.println("Who's salary are you want to calculte?\n 1.full time Employee\n 2.Part Time Employee");
             int choice = sc.nextInt();
             sc.nextLine();
             switch(choice){
                        case 1: 
                                System.out.println("Salary is : " + FullTimeEmployee.calculateSalary());
                              break;
                        case 2:
                                System.out.println("Salary is :" + PartTimeEmployee.calculateSalary());
                             break;
                    }
                    System.out.println("\n Are want to calculate salary of more employees? (yes/no) : ");
               String yesorNot = sc.nextLine();
              if(yesorNot.equalsIgnoreCase("yes")){conti = true;}
              }while(conti);
          }
 }  
                           
                    