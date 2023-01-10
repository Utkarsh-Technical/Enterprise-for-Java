package Basic;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class TestApp {

	public static void main(String[] args) throws SQLException {
		// Loading and register the driver.
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Registered");
		
		//Establish the Connection.
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false";
		String username = "root";
		String password = "Utkarsh98";
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established");
		
		
		//Creating the Statement Object(to move the location using connection)
		Statement statement = connection.createStatement();
		
		//Using Statement Object execute the Query.
		String sqlSelectQuery = "Select * from student";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("Executing the Sql Query and Fetching Data...");
		
		// Process the resultSet to get the data
		System.out.println("ID"+"\t"+"Name"+"\t"+"Age"+"\t"+"Addr");
		while(resultSet.next()) {
			int sid = resultSet.getInt("sid");
			String sname = resultSet.getString("sname");
			int sage =  resultSet.getInt("sage");
			String saddr = resultSet.getString("saddr");
			System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddr);
		}
		
		// Closing the resources in the reverse order of the creation.
//		resultSet.close();
//		statement.close();
//		connection.close();
	}

}
