package smartcity;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DbConnect {
	Connection connect=null;
	/**
	 * @return
	 */
	public static Connection dataConnector()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","*******");
			JOptionPane.showMessageDialog(null, "Successful connection");
			return connect;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error in connection");
			return null;
		}
	}
	

}
