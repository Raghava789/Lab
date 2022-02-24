package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "123@sql");
		Statement s=c.createStatement();

		try {
			
			String sql="select * from data";
			ResultSet rs=s.executeQuery(sql);
			while(rs.next()) {
				System.out.print("ID : " + rs.getInt("id"));
				System.out.print(", fname : " + rs.getString("fname"));
				System.out.print(", lname : " + rs.getString("lname"));
				System.out.println(", Age : " + rs.getInt("age"));
				System.out.println("-------------------------------------------------");
			}
			c.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
