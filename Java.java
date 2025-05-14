package p1;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("1");	
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("2");	
			System.out.println("Driver Loaded Successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/java","root","Navanath123");
			System.out.println("Connection Done Successfully");
			
			Statement st = con.createStatement();
			
			
			String q1 = "insert into persons(PersonID, LastName, FristName) values (102, 'om', 'avate')";
			st.executeUpdate(q1);

			System.out.println("Row inserted Successfully...");
			
			PreparedStatement pst = con.prepareStatement("insert into persons(PersonsID,LastName, FristName) values (103,'Nava','imca')");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id : ");
			int id = sc.nextInt();
			pst.setInt(1, id);
			System.out.println("Enter employee Name : ");
			String nm = sc.next();
			pst.setString(2, nm);
			System.out.println("Enter employee Designation : ");
			String des = sc.next();
			pst.setString(3, des);
			pst.executeUpdate();
			
			ResultSet rs = st.executeQuery("Select * from emp");
			
			while (rs.next())
			{
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			con.close();
			sc.close();
		}catch(Exception e){}
	}

}