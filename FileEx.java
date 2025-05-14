/*import java.io.*;

public class FileEx {
	public static void main(String[] args) {
	
	try{
		BufferedReader br = new BufferedReader( new FileReader("imca.txt"));
		String s;
		while ((s=br.readLine()) != null)
		System.out.println(s);
		   }
	   catch(Exception e)
		{}
	}
}
*/


/*
import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader( new FileReader("imca.txt"));
	String s;
	s=br.readLine();
	System.out.println(s);
	s=br.readLine();
	System.out.println(s);
	s=br.readLine();
	System.out.println(s);
	s=br.readLine();
	System.out.println(s);
	}
}
*/
/*
import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader( new FileReader("imca.txt"));
	String s;
	while ((s=br.readLine())!= null)
	System.out.println(s);
		}
}
*/
/*
import java.io.*;

public class FileEx {
	public static void main(String[] args) {
	try {
//	BufferedReader br = new BufferedReader( new FileReader("imca.txt"));
	BufferedReader br = new BufferedReader( new FileReader("abc.txt")); // exception is thrown
	String s;
	while ((s=br.readLine())!= null)
		System.out.println(s);
	}catch(Exception e){ System.out.println("Error " + e.getMessage()); }
		}
}
*/

/*
import java.io.*;

public class FileEx {
	public static void main(String[] args) {
	try {
	BufferedReader br = new BufferedReader( new FileReader("imca.txt"));
	BufferedWriter bw = new BufferedWriter( new FileWriter("pqr.txt"));
	String s;

	while ((s=br.readLine())!= null)
		{
		System.out.println(s);
		s = s.replaceAll("\\d","#");
		bw.write(s);//All string on single line
		//bw.write(s);
		bw.flush();
		//bw.newLine();
		}
	
	}catch(Exception e)
			{ System.out.println("Error " + e.getMessage()); }
	}
}
*/
/*
import java.io.*;

public class FileEx {
	public static void main(String[] args) {
	
	try
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
 
		String s = br.readLine();
		System.out.println("Your name is: " + s);
	} catch(Exception e)
		{System.out.println("Error : " + e.getMessage());}

	}
}
*/



import java.io.*;

public class FileEx {
	public static void main(String[] args) {
	
	try
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new FileWriter("pqr.txt"));
		System.out.print("Enter your name: ");
 
		String s = br.readLine();
		System.out.println("Your name is: " + s);
		bw.write(s);
		bw.flush();
	} catch(Exception e)
		{System.out.println("Error : " + e.getMessage());}

	}
}

/*
import java.io.*;

public class FileEx {
	public static void main(String[] args) {
	int charcnt,line,word=0;
	charcnt=line=0;
	try {
	BufferedReader br = new BufferedReader( new FileReader("imca.txt"));
	String s;
	
	

	while ((s=br.readLine())!= null)
		{
			for(int i=0; i< s.length();i++){
				if(s.charAt(i)!=' '){
					charcnt +=1;
					}
				else{
					word +=1;
					charcnt++;
				}
			}//end of for
		line++;
		word++;
		}
	}

   	catch(Exception e)
		{System.out.println("Error : " + e.getMessage());}
	System.out.println("Words : "+word +"\n"+"lines : "+line+"\n" +"characters : "+charcnt);
	}
}
					
*/import java.io.*;

public class FileEx {
    public static void main(String[] args) {
        int charcnt = 0, line = 0, word = 0;
        int digitCount = 0, spaceCount = 0, otherCharCount = 0;  // Added counters for digits, spaces, and other characters
        try {
            BufferedReader br = new BufferedReader(new FileReader("imca.txt"));
            String s;

            while ((s = br.readLine()) != null) {
                line++;  // Increment line count for each line read
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);

                    // Count characters
                    if (c != ' ') {
                        charcnt++;  // Increment character count for non-space characters
                    }

                    // Count words (whenever space is encountered, assume a word boundary)
                    if (c == ' ' || c == '\t') {
                        word++;  // Increment word count when a space or tab is encountered
                    }

                    // Count digits
                    if (Character.isDigit(c)) {
                        digitCount++;  // Increment digit count if the character is a digit
                    }

                    // Count spaces
                    if (c == ' ') {
                        spaceCount++;  // Increment space count if the character is a space
                    }

                    // Count other characters (non-space, non-digit)
                    if (!Character.isDigit(c) && c != ' ') {
                        otherCharCount++;  // Increment other character count
                    }
                }
                // Increment word count for the last word in a line (if it doesn't end with space)
                if (!s.trim().isEmpty()) {
                    word++;
                }
            }

            br.close();  // Close the reader when done
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        // Print the counts
        System.out.println("Words: " + word);
        System.out.println("Lines: " + line);
        System.out.println("Characters (non-space): " + charcnt);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Other Characters: " + otherCharCount);
    }
}
