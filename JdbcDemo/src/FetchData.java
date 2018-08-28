import java.sql.*;


public class FetchData {

	public static void main(String[] args)
	{
		try
		{
			Connection con=JdbcConnection.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rst=stmt.executeQuery("Select * from emp");
			while(rst.next())
			{
			System.out.println(rst.getInt(1)+"\t"+rst.getString(2));	
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
