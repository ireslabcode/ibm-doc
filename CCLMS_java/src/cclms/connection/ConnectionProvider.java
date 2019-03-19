package cclms.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cclms.common.util.ConnectionProperties;

public class ConnectionProvider {
	
public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(ConnectionProperties.DATA_BASE_DRIVER);
		Connection  con = DriverManager.getConnection(ConnectionProperties.DATA_BASE_URL,ConnectionProperties.DATA_BASE_USER,ConnectionProperties.DATA_BASE_PASSWORD);
		return con;
	}
}
