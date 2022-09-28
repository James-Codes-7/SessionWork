package attendancesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnect {

	public  Statement jdbcConnection() throws ClassNotFoundException, SQLException {

		
		
			String query="select * from studenttab";
			
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/students?useSSL=false&serverTimezone=Asia/Shanghai",
					"root","James124@");
			Statement statement=connection.createStatement();
			connection.close();
			return statement;
	
		
		
	
	}

}
