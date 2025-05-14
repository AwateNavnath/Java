import java.sql.*;

public class jdbcdemo
	{
		public static void main(String[] args)
		{
			try
			{
			System.out.println("1");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Navnath123");
			System.out.println("Connection Done Successfully");
			Statement st = con.createStatement();
			System.out.println("2");
			ResultSet rs = st.executeQuery("select * from customer");
			System.out.println("3");
			while(rs.next())
				{
			System.out.println("PersonID = " + PersonID + " id = "+ LastName + "FirstName");
				}
			con.close();
			}
			catch(Exception e) 
			{}
			
		}
}