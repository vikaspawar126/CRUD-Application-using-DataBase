import java .sql.*;
public class Update_Record {

	public static void getUpdate() {
//	public static void main(String[] args) {

		try {

		//start database Connection
		Connection con = DB_Connection.getConnection();
		
		//use statement interfate 
		Statement smt = con.createStatement();

		String q = "alter table student rename column snamen to sname";
		
		//here execute query
		smt.executeUpdate(q);
		//close connection
				con.close();
				
		//normal messege 
		System.out.println("record updated succesfully...");
	}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
