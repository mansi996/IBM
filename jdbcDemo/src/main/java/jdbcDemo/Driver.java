package jdbcDemo;
import java.sql.*;
public class Driver {
	
	public static void main(String[] args)
	{ 
		
			String dbURL = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root123";
			Connection dbCon = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
			//Class.forName("com.mysql.jdbc.Driver");
			dbCon = DriverManager.getConnection(dbURL, username, password);
			stmt = dbCon.createStatement();
			rs = stmt.executeQuery("SELECT firstName,lastName from student WHERE age=22");
			while (rs.next()) {
			String firstname = rs.getString("firstName");
			String lastname = rs.getString("lastName");
			System.out.println(firstname);
			System.out.println(lastname);
			}

			} catch (Exception e) {
			System.out.print("Exception");
			}

		
		}}
