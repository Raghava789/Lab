package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "123@sql");
		Statement s=c.createStatement();
		try {
			String sql="insert into data(id, fname, lname, age) values(101, 'Mike', 'Hasi', 27)";
			s.executeUpdate(sql);
			String sql1="insert into data(id, fname, lname, age) values(102, 'Willy', 'Jones', 26)";
			s.executeUpdate(sql1);
			String sql2="insert into data(id, fname, lname, age) values(103, 'Ariana', 'Grande', 24)";
			s.executeUpdate(sql2);
			String sql3="insert into data(id, fname, lname, age) values(104, 'Robert', 'Niro', 25)";
			s.executeUpdate(sql3);
			System.out.println("Inserted...");
			c.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
