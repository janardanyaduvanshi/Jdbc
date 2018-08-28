import java.sql.*;
public class JdbcConnection {

	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/janardan","root","password");
		return con;
	}
}
//("jdbc:mysql://localhost/feedback?" + "user=sqluser&password=sqluserpw");