import java.sql.*;
import java.util.Scanner;


public class DeleteData {

	public static void main(String[] args) {
		try {
			Connection con=JdbcConnection.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
			System.out.println("Enter emp id");
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Data deleted");
			con.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
