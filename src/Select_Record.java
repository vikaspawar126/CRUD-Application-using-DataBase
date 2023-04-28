// here import package
import java.sql.*;

public class Select_Record {

	public static void getSelect() {
//	public static void main(String[] args) {

		try
		{
		//here load driver and ad database connection
		Connection con = DB_Connection.getConnection();
		
		//here create statement for select data
		Statement smt = con.createStatement();
		
		//here resultset object 
		String q = "select * from student";
		ResultSet rs = smt.executeQuery(q);
		
		//here create while loop 
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3));
		}
	}
		catch(Exception e)
		{
			System.out.println();
		}
	}

}
