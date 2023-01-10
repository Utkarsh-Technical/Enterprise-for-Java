package Basic;
import java.sql.*;
public class IndustryStandard {

	public static void main(String[] args) throws SQLException {
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
				}
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(resultSet != null) {
				resultSet.close();
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
