import java.sql.*;
public class Delete_Record {

	public static void getDelete() 
	{
	//public static void main(String[] args) {
		
		try
		{
		
		//here start database connection code
		Connection con = DB_Connection.getConnection();
		
		//use Statement interface
		Statement smt = con.createStatement();
		
		//execute query
		String q = "delete from student where srlln=104";
		smt.executeUpdate(q);
		
		//msg
		System.out.println("record deleted succesfully...");
     //close connection
		con.close();
		
	}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
