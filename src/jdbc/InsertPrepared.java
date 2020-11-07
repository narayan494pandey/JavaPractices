package jdbc;

import java.sql.*;

class InsertPrepared {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

			PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?)");
			stmt.setInt(1, 7);// 1 specifies the first parameter in the query
			stmt.setString(2, "riyansh");
			stmt.setString(3, "mechanical");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		/*
		 * Example of PreparedStatement interface that updates the record
          PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");  
          stmt.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name  
           stmt.setInt(2,101);  
  
           int i=stmt.executeUpdate();  
           System.out.println(i+" records updated");
		 */

	}
}