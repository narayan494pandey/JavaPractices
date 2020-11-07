package jdbc;

import java.sql.*;
import java.io.*;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?,?)");
			ps.setInt(1, 2);
			ps.setString(2, "sonu");
			FileInputStream fin = new FileInputStream("F:\\Saved Pictures\\images\\col3.jpg");
			ps.setBinaryStream(3, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
 * ?sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false for solving truncation error. 
  */
