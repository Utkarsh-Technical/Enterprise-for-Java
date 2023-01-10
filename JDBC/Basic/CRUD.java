package Basic;

// Importing Packages
import java.sql.*;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;

public class CRUD {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		// Driver Manager
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Registered");
		
		// Resource allocation
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		// Establish the Connection
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false";
		String username = "root";
		String password = "Utkarsh98";
		try {
			connection = DriverManager.getConnection(url, username, password);
			if(connection != null) {
				statement = connection.createStatement();
				if(statement != null) {
					System.out.println("1. Create"+"\n"+"2. Update"+"\n"+"3. Delete"+"\n"+"4. Read"+"\n"+"5. Exit");
					while(true) {
						int choice = sc.nextInt();
						switch(choice) {
							// Insert the Data
							case 1:
								System.out.println("Enter the Student Details");
								
								System.out.println("ID : ");
								int Sid = sc.nextInt();
								
								System.out.println("Name : ");
								String Sname = sc.next();
								
								System.out.println("Age : ");
								int Sage = sc.nextInt();
								
								System.out.println("Address : ");
								String Saddr = sc.next();
								
								String insertQuery = "insert into student(`sid`,`sname`,`sage`,`saddr`)values("+Sid+",'"+Sname+"',"+Sage+",'"+Saddr+"')";
								int noOfRows = statement.executeUpdate(insertQuery);
								System.out.println("Insertion Done\n No. of Rows Affected : "+noOfRows);
								break;
							// Update the Data
							case 2:
								System.out.println("Enter the Details of Student to be Updated");
								String UpdateQuery = "Update student set sname = 'Shreroo' where sid = 2";
								noOfRows = statement.executeUpdate(UpdateQuery);
								System.out.println("Updatation Done\n No. of Rows Affected : "+noOfRows);
								break;
							// Delete the Data
							case 3:
								System.out.println("Enter the Details of Student to be Updated");
								String deleteQuery = "Delete from student where sid = 6";
								noOfRows = statement.executeUpdate(deleteQuery);
								System.out.println("Updatation Done\n No. of Rows Affected : "+noOfRows);
								break;	
								
							// Fetch all the Student Data
							case 4:
								String sqlQuery = "Select * from student";
								resultSet = statement.executeQuery(sqlQuery);
								
								if(resultSet != null) {
									System.out.println("ID"+"\t"+"Name"+"\t"+"Age"+"\t"+"Addr");
									System.out.println("======================================");
									while(resultSet.next()) {
										int sid = resultSet.getInt("sid");
										String sname = resultSet.getString("sname");
										int sage =  resultSet.getInt("sage");
										String saddr = resultSet.getString("saddr");
										System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddr);
									}
								}
								break;
							//Exit	
							case 5 :
								System.out.println("Congratulations !! You have Completed the Work.");
								System.exit(0);
								break;
						}
						//System.out.println("1. Insertion of Data"+"\n"+"2. Update the Data"+"\n"+"3. Delete the Data"+"\n"+"4. Fetch all the Data"+"\n"+"5. Exit");
					}
				}}
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
			}
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
	}
}
