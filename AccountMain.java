import java.util.Scanner;
import java.lang.Math;

class Account{
         protected String cname;
         protected int acno;
         protected String tac;
         protected double bal;
 
        public Account(){
             cname = " ";
             acno = 0;
             tac = " ";
             bal = 0;
       }
public void display(){
         System.out.println("Customer name is: " + this.cname);
         System.out.println("Customer acccount number is : " + this.acno);
         System.out.println("Account type is: " + this.tac);
         System.out.println(" Account balance is : " this.bal);
       }
     
     void displaBalance(){
        System.out.println("Account blance is :" + this.bal);
          }
     void deoposit(double amt){
          this.bal += amt;
          Syatem.out.println("Amount Deposited = " + amt);
          displayBalance();
        }
     }
class SavingAC extends Account{
             private final double irate = 0.06;
             SavingAC(String cname, int acno, String tac, double bal) {
             deposit(iamt);
           }
void withdraw(double amt) {
    if(amt <= this.bal){
        bal -= amt;
        Syatem.out.println("Amount Withdrawn: " + amt);
        checkminBal();
        } else{
            System.out.println("Insufficient balance to witdraw.");
          }
 }

void checkMinBal(){
       if(this.bal < 1000){
        System.out.println("Penalty of Rs 100 due to balance below minimun.");
         bal -= 100;
         displayBalance();
         }
      }
}

class Current extends  Account{
           CurrentAC( String cname, int acno, String tac , double bal) {
           super(cname, acno, tac, bal);
     }

void withdraw(double amt) {
            if(amt <= (bal + 500000)){
             bal -= amt;
            System.out.println("Amount withdrawn:" + amt);
            checkMinBal();
          } else {
            System.out.println("Withdrawal limit exceeded.");
       }
}
void CheckMinBal(){
       if (bal < -50000){
             System.out.println("penalty of Rs 5000 bue  to overdraft.");
             bal -= 5000;
             displayBalance();
              }
        }
}

class AccountMain{
            public static void main(String[] args) {
             Scanner sc = new Sanner(System.in);
             System.out.println("please enter account you  want to store:");
             int acno = sc.nextInt();
             sc.nextLine();
            Account[] A = new Account[n];
            
            for(int i=0; i<n; i++) {
             System.out.println("please enter account holder name:");
             String cname = sc.nextLine();
            System.out.println("Please enter account type saving/Current:");
            String tac = sc.nextLine();
            System.out.println("Please enter account balance:");
            double bal = sc.nextDounble();
  
           if(tac.equalsIgnorecase("Saving")){
                System.out.println("please enter the number of year for interest calculation :");
            int nyear = sc.nextInt();
            System.out.println("please enter amount you want to withdraw:");
            double amt = sc.nextDouble();
            A[i] = new SavingAc(cname, acno tac , bal);
           (( SavingAc) A[i]).toComputeInt(nyear);
           (( SavingAC) A[i].withdraw(amt);
           }else if(tac.equalsIgnoreCase("Current")){
           System.out.println("Please enter amount to withdraw:");
           double amt = sc.nextDouble();
           A[i] = new currentAc(cname,acno, tac,bal);
           ((CurrentAc) A[i]).withdraw(amt);
           }else{
                 System.out.println("Invalid account type.please enter either 'Saving' or 'Current',");
            i--;
          }
        sc.nextLine();
      }
      
     System.out.println("Bank Information Detail:");
     for(int i = 0; i<n; i++){
             System.out.println("Account information of person " + (i+1));
            A[i].display();
          }
      }
 }


                          

 


