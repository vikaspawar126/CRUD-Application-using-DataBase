import java.sql.Connection;
import java.sql.DriverManager;
//database connection & driver code
public class DB_Connection {

	public static Connection getConnection()
	{
		Connection connection = null;
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uname = "system";
			String pass = "oracle";
			
			connection = DriverManager.getConnection(url,uname,pass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
