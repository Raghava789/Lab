package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "123@sql");
			Statement s=c.createStatement();
			String sql="CREATE TABLE project" + "(p_id INTEGER not NULL primary key,  "
			+"p_name varchar(20) not NULL,"+
					" id INTEGER not NULL," +
			" FOREIGN KEY(id) REFERENCES DATA(id))";
			s.executeUpdate(sql);
			System.out.println("Table Created....");
			c.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}

	}

}
