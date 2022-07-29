package JDBC_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class ExecuteQueryTest {
	@Test
	public void ExecutequryTest() throws Exception
	{
	
		//step=1 Register  the Driver
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
		//step=2 Connect to Database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
		//step=3 Create Statement
		Statement stmt=con.createStatement();
		
		//step=4 Execute Qury 
		ResultSet result=stmt.executeQuery("select * from students_info;");
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		//step=5 close connection with Database
		con.close();
	}
	

}
