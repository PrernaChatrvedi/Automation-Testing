package Task24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteDataIntoSQL {

	public static void main(String[] args) throws SQLException {
		String URL ="jdbc:mysql://localhost:3306/prerna";
		String uname="root";
		String psw="Java@1234";
		Connection connection=DriverManager.getConnection(URL,uname,psw);
		String sql = "INSERT INTO employeetable (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// Insert first employee
        preparedStatement.setInt(1, 101); 
        preparedStatement.setString(2, "Jenny");
        preparedStatement.setInt(3, 25); 
        preparedStatement.setDouble(4, 10000); 
        preparedStatement.executeUpdate();

        // Insert second employee
        preparedStatement.setInt(1, 102);
        preparedStatement.setString(2, "Jacky");
        preparedStatement.setInt(3, 30);
        preparedStatement.setDouble(4, 20000);
        preparedStatement.executeUpdate();

        // Insert third employee
        preparedStatement.setInt(1, 103);
        preparedStatement.setString(2, "Joe");
        preparedStatement.setInt(3, 20);
        preparedStatement.setDouble(4, 40000);
        preparedStatement.executeUpdate();

        // Insert fourth employee
        preparedStatement.setInt(1, 104);
        preparedStatement.setString(2, "John");
        preparedStatement.setInt(3, 40);
        preparedStatement.setDouble(4, 80000);
        preparedStatement.executeUpdate();

        // Insert fifth employee
        preparedStatement.setInt(1, 105);
        preparedStatement.setString(2, "Shameer");
        preparedStatement.setInt(3, 25);
        preparedStatement.setDouble(4, 90000);
        preparedStatement.executeUpdate();

        System.out.println("Data inserted successfully!");
        connection.close();

	}

}
