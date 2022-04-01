package Mavenproject1;

import java.sql.*;

public class MSsql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=root");  
	 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Employee");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
		catch(Exception e){ 
			System.out.println(e);
			
		}  

	}

}
