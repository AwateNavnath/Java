import java.io.*;
import java.util.Scanner;
import java.util.Random;
calss Quetion implements Serializable 
{
         private static final long serialverionUID = 1L;
  private String Quation;
  private String option_a;
  private String option_b;
  private String option_c;
  private String option_d;
  private String AnsWer;
  
public Quetions()
{
         this.Quation=" ";
         this.option_a = " ";
         this.option_b = " ";
         this.option_c = " ";
         this.option_d = " ";
         this.Answer= " ";
}
public Quations(String Quation, String option_a,String option_b, String oprton_c,String option_d,String Answer)
{
         this.Quation = Quation;
         this.option_a = option_a;
         this.option_b = option_b;
         this.option_c = option_c;
         this.option_d = option_d;
         this.Answer = Answer;
 }
public void setQuetion(String Quetion)
{
         this.Quetion = Quetion;
}
public void setoptions(String option_a, String option_b,String option_c,String option_c,String option_d)
{
             this.option_a = option_a;
             this.option_b = option_b;
             this.option_c = option_c;
             this.option_d = option_d;
}
public void setAnswer(String Answer)
{
          this.Answer = Answer;
}

public String getQuetion()
{
       return this.Quetion;
}
public String getOption1()
{
        return this.Quation_a;
}
public String  getOption2()
{
        return this.Option_b;
}
public string getOption3()
{
      return this.Option_c;
}
public String getOption4()
{
        return this.option_d;
}
public String getAnswer()
{
      return this.Answer;
}
@Override
public String toString(){
      return Quetion + "\n" + 
           "1. " + option_a + "\n"+
           "2. " + option_b + "\n"+
           "3. " + option_c + "\n"+
           "4. " + option_d + "\n"+
           "Answer: " + Answer + "\n";
}
}
public class QuestionFile {
            public static void main(String[] args)
            {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter How many Quesions : ");
             int n = sc.nextLine();
             String d = sc.nextLine();
             try{
                    objectOutputStream os = new objectputStream(new FileInputStrem("question.dat"));
                    Quetion[] qs = new Quesions[n];
                    for (int i = 0; i < n ; i++) {
                     qs[i] = (Quetions) ois.readobject();
                     System.out.println(qs[i].toString());
             }
            // Random Question 
            Random rand = new Random();
            int m = 2;
            boolean[] selected = new boolean[m]; // To track which questions have been 
selected 
         int count = 0;
         while (count < m) {
            int randomIndex = rand.nextInt(m);
            if (!selected[randomIndex]) { // check if the question is already selected 
                  System.out.println(qs[randomIndex]);
                  selected[randomIndex] = true;
                  count++;
             }
           }
          ois.close();
    }
   catch(Exception e) {}
    }// end of main
}//end of class
  
       
 


