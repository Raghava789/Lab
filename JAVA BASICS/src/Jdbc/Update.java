package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "123@sql");
		Statement s=c.createStatement();
		try {
			String sql="update data set lname='Gatta' where(id=100)";
			s.executeUpdate(sql);
			System.out.println("Updated...");
			c.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
