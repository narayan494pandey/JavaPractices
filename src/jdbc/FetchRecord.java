package jdbc;

import java.sql.*;

class FetchRecord {
	public static void main(String args[]) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Statement stmt = con.createStatement();

		// stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");
		// int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000
		// where id=33");
		int result = stmt.executeUpdate("delete from emp765 where id=33");
		System.out.println(result + " records affected");
		con.close();
	}
}
/*
 *Example of Scrollable ResultSet
Let’s see the simple example of ResultSet interface to retrieve the data of 3rd row.

import java.sql.*;  
class FetchRecord{  
public static void main(String args[])throws Exception{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
ResultSet rs=stmt.executeQuery("select * from emp765");  
  
//getting the record of 3rd row  
rs.absolute(3);  
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
  
con.close();  
}}  
 */
