import java.io.*;
import java.util.Scanner;
import java.util.Random;
class Quetions implements Serializable
{
 	private static final long serialVersionUID = 1L;
private String Quetion;
 private String option_a;
 private String option_b;
 private String option_c;
 private String option_d;
 private String Answer;

public Quetions()
{ 
	this.Quetion=" ";
	this.option_a=" ";
	this.option_b=" ";
	this.option_c=" ";
	this.option_d=" ";
	this.Answer=" ";
}
public Quetions(String Quetion,String option_a,String option_b,String option_c,String option_d,String Answer)
{
	this.Quetion=Quetion;
	this.option_a=option_a;
	this.option_b=option_b;
	this.option_c= option_c;
	this.option_d=option_d;
	this.Answer=Answer;
}
public void setQuetion(String Quetion)
{
	this.Quetion=Quetion;

}
public void setOptions(String option_a,String option_b,String option_c,String option_d)
{
	this.option_a=option_a;
	this.option_b=option_b;
	this.option_c= option_c;
	this.option_d=option_d;
}
public void setAnswer(String Answer)
{
	this.Answer=Answer;
}


public String getQuetion()
{
	return this.Quetion;
}

public String getOption1()
{
	return this.option_a;
}
public String getOption2()
{
	return this.option_b;
}
public String getOption3()
{
	return this.option_c;
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
public String toString() {
    return Quetion + "\n" +
           "1. " + option_a + "\n" +
           "2. " + option_b + "\n" +
           "3. " + option_c + "\n" +
           "4. " + option_d + "\n" +
           "Answer: " + Answer + "\n";
}
}
public class QuestionFile {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter How many Question : ");
	int n = sc.nextInt();
	String d = sc.nextLine();
	try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("question.dat"));
		for(int i = 0; i< n; i++)
		{
			System.out.println("Enter Question  : ");
			String q = sc.nextLine();
			System.out.println("Enter Option-a : ");
			String o1 = sc.nextLine();
			System.out.println("Enter Option-b : ");
			String o2 = sc.nextLine();
			System.out.println("Enter Option-c : ");
			String o3 = sc.nextLine();
			System.out.println("Enter Option-d : ");
			String o4 = sc.nextLine();
			System.out.println("Answer Option : ");
			String ans = sc.nextLine();
			Quetions qobj = new Quetions(q,o1,o2,o3,o4,ans);
			os.writeObject(qobj);
		}//end of for
		os.close();
		sc.close();
	}//end of try
	catch(Exception e) {}
	//Reading Question
    try 
    {
    	
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("question.dat"));
        Quetions[] qs = new Quetions[n];
        for (int i = 0; i < n; i++) {
        	qs[i] = (Quetions) ois.readObject();
        	System.out.println(qs[i].toString());
        }
        // Random Question
        Random rand = new Random();
        int m = 2;
        boolean[] selected = new boolean[m];  // To track which questions have been selected

        int count = 0;
        while (count < m) {
            int randomIndex = rand.nextInt(m);
            if (!selected[randomIndex]) {  // Check if the question is already selected
                System.out.println(qs[randomIndex]);
                selected[randomIndex] = true;
                count++;
            }
        }
        ois.close();
    }
    catch(Exception e) {}
	}//end of main
}//end of class
