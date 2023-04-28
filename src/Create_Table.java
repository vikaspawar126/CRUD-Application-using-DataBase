//we are create studnet table

//here import package
import java.sql.*;

public class Create_Table {

	public static void getCreate()
	{
//	public static void main(String[] args) {
		
		try
		{
			//load and register driver and 
			//opening database connection to oracle server
			Connection con = DB_Connection.getConnection();
			
			//here getting statement object to execute query
			Statement smt = con.createStatement();
			String q = "c"
					+ "reate table student(srlln number, sname varchar(10), sfees number)";
			
			//here execute query
			smt.executeUpdate(q);
			
			//normal message that table is created 
			System.out.println("Table is created succesfully...");
			
			//here close connection
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);//print exception
		}

	}

}
