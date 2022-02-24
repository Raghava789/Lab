package Jdbc;
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "123@sql");
		Statement s=c.createStatement();
		String sql="CREATE TABLE DATA" + "(id INTEGER not NULL, "+ "fname VARCHAR(30),"+"lname VARCHAR(30), "+ "age INTEGER, "+ " PRIMARY KEY(id))";
		s.executeUpdate(sql);
		System.out.println("Table Created....");
		c.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
