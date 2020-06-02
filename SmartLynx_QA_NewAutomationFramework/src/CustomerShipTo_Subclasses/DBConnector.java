package CustomerShipTo_Subclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnector {

	
	@Test
	public static void main() throws ClassNotFoundException, SQLException {
		
		/*String dburl="208.104.29.80,5555";
		
		String username=*/
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("driver loaded");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://208.104.29.80:5555/SmartLynx_v9_QA", "smartlogixdbuser", "Sm@rt!");
		
	System.out.println("Connected to DB");

	Statement smt=con.createStatement();
	
	ResultSet rs=  smt.executeQuery("select * from sltruck");
	
	
while (	rs.next()) {
	
	
String truckid=	rs.getString("SLT_Id");
	
	System.out.println("Truck is" + truckid);
	
}
	
	
	}

}
