import java.sql.*;
import java.util.Scanner;


public class PrepreSttm {

	public static void main(String[] args) throws Exception
	{
		try
		{
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into emp(id,name) values(?,?)");
	    Scanner sc=new Scanner(System.in);
	    while(true)
	    {
	    System.out.println("Enter name");
	    String name=sc.nextLine();
	    System.out.println("Enter id");
	    int aid=sc.nextInt();
	    pstmt.setString(2,name);
	    pstmt.setInt(1,aid);
	    pstmt.addBatch();
	    System.out.println("Enter more data press yes/no");
	    sc.nextLine();
	    String ans=sc.nextLine();
	    if(ans.equalsIgnoreCase("no"));
	    break;
	    }
	    pstmt.executeBatch();
	    con.close();
	    sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
