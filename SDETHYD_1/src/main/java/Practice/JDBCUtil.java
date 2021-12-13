package Practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class JDBCUtil {
	@Test
	
	public void getExecuteQuery()  throws SQLException
	{
		Connection con=null;
		try {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//step 2:establish connection with database
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer" ,"root","root");
		//step3:issue create statement
		Statement stat=(Statement) con.createStatement();
		//step 4: Execute the query
		int result=((java.sql.Statement) stat).executeUpdate(" insert into customer values('ISMAIL','HS','Sydney');");
		//int result=stat.executeUpdate
		
		
		if(result==1)
		{
			System.out.println("customer is created successfully");
		}
		else
		{ 
			System.out.println("query failed");
		}
		}
		catch(Exception e) {
		}
		finally {
			con.close();
		}
	}
}
		
