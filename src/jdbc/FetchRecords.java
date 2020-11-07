package jdbc;

import java.sql.*;

class FetchRecords {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into user420 values(190,'abhi')");
		stmt.addBatch("insert into user420 values(191,'umesh')");

		stmt.executeBatch();// executing the batch

		con.commit();
		con.close();
	}
}
