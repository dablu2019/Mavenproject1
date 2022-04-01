package Mavenproject1;

import java.sql.*;
public class Mysql1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dablu","root","Dablu123@");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Student");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			

	}

