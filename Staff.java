/* An education istitution wants to maintain a database of its employees. consider the following class and define the variance function to create the database and retrieve individual information function to create the database and retrieve individual information 
                                  
                                    Staff
                                    code 
                                    name 


  Teacher                          typist                        officer           
  subject                          speed                          grade 
  publiction */
import java.util.Scanner;
class Staff {
       private int code ;
       private String name;
        
       Staff(){
          this.code = 0;
          this.name = "";
       }
       Staff(String n, int c){
          this.code = c;
          this.name = n;
         }
         
    public void display(){
     System.out.println("Staff name :" + this.name);
     System.out.println("code :" + this.code);
    } 
 } 
class Teacher extends Staff{
   private String subject;
   private String publication;
   Teacher(){
             super();
             this.subject = "";
             this.publication = "";
        }
   Teacher(String n, int c,String s, String p){
          super(n,c);
          this.subject = s;
          this.publication = p;
        }
  public void display(){
        super.display();
        System.out.println("Subject :" + this.subject);
        System.out.println("publication : "+ this.publication);
       }
  }
class Typist extends Staff{
     private int speed ;
        Typist() {
             super();
             this.speed = 0;
       }
      Typist(String n, int c, int s){
         super(n,c);
         this.speed = s;
        }
     public void display(){
           super.display();
           System.out.println("Speed" + this.speed);
          }
      }
class Officer extends Staff{
               private String grade;
               Officer(){
                      super();
                      this.grade = "";
            }
            Officer(String n, int c,String G){
              super(n,c);
              this.grade = G;
        }
        public void display(){
             super.display();
             System.out.println("Grade is : " + this.grade);
           }
       }
class DemoMain{
             public static void main(String[] args){
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the total number of staff");
               int m = sc.nextInt();

           Staff  arr[] = new Staff[m];
   for(int i= 0; i<m ; i++){
          System.out.println("Enter name: ");
          String n = sc.nextLine();
          
          System.out.println("Enter the code :" );
          int c = sc.nextInt();
         
          System.out.println("Enter the role : ");
          String R = sc.nextLine();
           
  if(R.equals("Teacher")){
          System.out.println("Enter subject :");
          String s = sc.nextLine();
          System.out.println("Publication: ");
          String p = sc.nextLine();
    
          arr[i] = new Teacher(n,c,s,p);
              }
  else if(R.equals("Officer")){
          System.out.println("Enter Grade : ");
          String G = sc.nextLine();
              
           arr[i] = new Officer( n,c,G);
         }
       else { System.out.println("Invalid input !");}
       }
for(int i = 0; i< m ; i++) {
        arr[i].display();
      }
    }//End of main 
 } // End of class
     
       
            

             
         
    
 
         

        

