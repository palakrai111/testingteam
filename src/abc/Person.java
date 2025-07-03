package abc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Person {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
		 String DB_URL = "jdbc:mysql://localhost:3306/StudentDao";
		 String DB_USERNAME = "root";
		 String DB_PASSWORD = "localhost";
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			 
		if(con != null)
		{
		   System.out.println("connected");	
		   String s = "select * from student";
		   PreparedStatement ps = con.prepareStatement(s);
		   
		   ResultSet rs = ps.executeQuery();
		  while(rs.next())
		  {
			  System.out.print(rs.getInt(1));
			  System.out.print(" "+rs.getString(2));
			  System.out.print(" "+rs.getString(3));
			  
		  }
		   
		}
		else
		{
			System.out.println("not connected");	
		}
	}

}
