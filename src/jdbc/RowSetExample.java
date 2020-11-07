package jdbc;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		// Creating and Executing RowSet
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/college");
		rowSet.setUsername("root");
		rowSet.setPassword("root");

		rowSet.setCommand("select * from user420");
		rowSet.execute();

		while (rowSet.next()) {
			// Generating cursor Moved event
			System.out.println("Id: " + rowSet.getString(1));
			System.out.println("Name: " + rowSet.getString(2));
			System.out.println("Salary: " + rowSet.getString(3));
		}

	}
}
//Full example of Jdbc RowSet with event handling
class MyListener implements RowSetListener {  
    public void cursorMoved(RowSetEvent event) {  
              System.out.println("Cursor Moved...");  
    }  
   public void rowChanged(RowSetEvent event) {  
              System.out.println("Cursor Changed...");  
   }  
   public void rowSetChanged(RowSetEvent event) {  
              System.out.println("RowSet changed...");  
   }  
} 