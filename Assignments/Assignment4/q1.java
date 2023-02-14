package Assignment4;

//Importing Packages
import java.sql.*;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;

public class q1 {

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
					// System.out.println("1. Create"+"\n"+"2. Update"+"\n"+"3. Delete"+"\n"+"4. Read"+"\n"+"5. Exit");
					while(true) {
						System.out.println("1. Create"+"\n"+"2. Update"+"\n"+"3. Delete"+"\n"+"4. Read"+"\n"+"5. Exit");
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
								System.out.println("Enter the sid of Student to be Updated");
								int sid = sc.nextInt();
								System.out.println("What want to update?\n1. sname\t2. sage\t3. saddr");
								int upcol = sc.nextInt();
								String UpdateQuery="";
								if(upcol == 1) {
									System.out.println("Enter the Name");
									String sname = sc.next();
									UpdateQuery = "Update student set sname = '"+sname+"' where sid ="+ sid;
								}
								else if(upcol == 2) {
									System.out.println("Enter the Age");
									int sage = sc.nextInt();
									UpdateQuery = "Update student set sage = '"+sage+"' where sid ="+ sid;
								}
								else if(upcol == 3) {
									System.out.println("Enter the Address");
									String saddr = sc.next();
									UpdateQuery = "Update student set saddr = '"+saddr+"' where sid ="+ sid;
								}
									noOfRows = statement.executeUpdate(UpdateQuery);
									System.out.println("Updatation Done\n No. of Rows Affected : "+noOfRows);
								break;
								
							// Delete the Data
							case 3:
								System.out.println("Enter the sid of Student to be Deleted");
								int del = sc.nextInt();
								String deleteQuery = "Delete from student where sid = "+del;
								noOfRows = statement.executeUpdate(deleteQuery);
								System.out.println("Delected \n No. of Rows Affected : "+noOfRows);
								break;	
								
							// Fetch all the Student Data
							case 4:
								String sqlQuery = "Select * from student";
								resultSet = statement.executeQuery(sqlQuery);
								
								if(resultSet != null) {
									System.out.println("ID"+"\t"+"Name"+"\t"+"Age"+"\t"+"Addr");
									System.out.println("======================================");
									while(resultSet.next()) {
										int fsid = resultSet.getInt("sid");
										String sname = resultSet.getString("sname");
										int sage =  resultSet.getInt("sage");
										String saddr = resultSet.getString("saddr");
										System.out.println(fsid+"\t"+sname+"\t"+sage+"\t"+saddr);
									}
								}
								break;
								
							//Exit	
							case 5 :
								System.out.println("Congratulations !! You have Completed the Work.");
								System.exit(0);
								break;
						}
						
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
