//for inserting record

//here import package
import java.sql.*;
import java.util.*;
//here take one class thats name is Insert_Record
public class Insert_Record {

	public static void getInsert() {
	//here creating main method
//	public static void main(String[] args) {

		try
		{
			//load reagister and driver 
			//and openning database connection to sql sever
			
			Connection con = DB_Connection.getConnection();
			
			//here we are use PreparedStatement for inserting multiple
			//records dynamically
			PreparedStatement psmt = con.prepareStatement("insert into student values(?,?,?)");
			
			//here we are creating one scanner class object for input the records
			Scanner sc = new Scanner(System.in);
			
			//here using while loop for inserting data based on condition
			while(true)
			{
				System.out.println("Enter student roll no. :");
				int srlln = sc.nextInt();
				
				System.out.println("Enter Student name:");
				String sname = sc.next();
				
				System.out.println("Enter Student fees:");
				int sfees = sc.nextInt();
				
				psmt.setInt(1,srlln);
				psmt.setString(2,sname);
				psmt.setInt(3, sfees);
				
				int count = psmt.executeUpdate();
				if(count>0)
				{
					System.out.println(count+" record is inserted");
				}
				else
				{
					System.out.println("no record inserted");
				}
				System.out.println("Do you want to more record[yes/no]");
				String ch = sc.next();
				if(ch.equalsIgnoreCase("no"))
				{
					break;
				}
			}
			//here close the connection
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
