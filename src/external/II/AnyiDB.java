package external.II;

import java.sql.*;

public class AnyiDB {
	//private final String driver = "oracle.jdbc.driver.OracleDriver";
	private final String driver = "com.mysql.jdbc.Driver";

	public Connection getConnection(String url, String user, String password) {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			if (conn != null && !conn.isClosed()) {
				System.out.println("connect success.");
			}
		} catch (ClassNotFoundException e1) {
			System.out.println("dirver not found.");
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		return conn;

	}

}
