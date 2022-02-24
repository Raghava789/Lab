package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "123@sql");
		Statement s=c.createStatement();
		try {
			String sql="insert into data(id, fname, lname, age) values(100, 'ram', 'G', 20)";
			s.executeUpdate(sql);
			System.out.println("Inserted...");
			c.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
