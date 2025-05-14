import java.util.Scanner;

class Quation {
    public String quation;
    public String option_1;
    public String option_2;
    public String option_3;
    public String option_4;
    public String ANS;

    public Quation() {
        this.quation = "";
        this.option_1 = "";
        this.option_2 = "";
        this.option_3 = "";
        this.option_4 = "";
        this.ANS = "";
    }

    public Quation(String quation, String option_1, String option_2, String option_3, String option_4, String ANS) {
        this.quation = quation;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
        this.ANS = ANS;
    }

    public void display() {
        System.out.println("Question: " + this.quation);
        System.out.println("Option 1: " + this.option_1);
        System.out.println("Option 2: " + this.option_2);
        System.out.println("Option 3: " + this.option_3);
        System.out.println("Option 4: " + this.option_4);
        System.out.println("Answer: " + this.ANS);
    }

    public void setQuation(String quation) {
        this.quation = quation;
    }

    public void setOptions(String option_1, String option_2, String option_3, String option_4) {
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
    }

    public void setAnswer(String ans) {
        this.ANS = ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many questions in the question paper?");
        int n = sc.nextInt();
        sc.nextLine(); 

        Quation[] arr = new Quation[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Quation();
            System.out.println("Enter the question for Quation[" + i+1 + "]:");
            arr[i].setQuation(sc.nextLine());

            System.out.println("Enter option 1:");
            arr[i].option_1 = sc.nextLine();
            System.out.println("Enter option 2:");
            arr[i].option_2 = sc.nextLine();
            System.out.println("Enter option 3:");
            arr[i].option_3 = sc.nextLine();
            System.out.println("Enter option 4:");
            arr[i].option_4 = sc.nextLine();
            System.out.println("Enter the answer:");
            arr[i].setAnswer(sc.nextLine());
        }

        
        System.out.println("\nAll Questions:");
        for (int i = 0; i < n; i++) {
            arr[i].display();
            System.out.println();
        }
    }
}


         
 
        
       
         
          
      
       
 

 
 
   
