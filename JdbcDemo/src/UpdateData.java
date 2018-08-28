import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class UpdateData {

	public static void main(String[] args)
	{
	try
	{
	Connection con=JdbcConnection.getConnection();
	PreparedStatement pstmt=con.prepareStatement("update emp set name=? where id=?");
    Scanner sc=new Scanner(System.in);
   
    
    System.out.println("Enter name");
    String name=sc.nextLine();
    
    System.out.println("Enter id");
    int id=sc.nextInt();
    
    pstmt.setString(1,name);
    pstmt.setInt(2,id);
    
    pstmt.executeUpdate();
    con.close();
    sc.close();
    
    System.out.println("Updated");
	}
	catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}

  }
}
