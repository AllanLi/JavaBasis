package database.I;

import java.sql.*;

public class DBDriver {
	// private final String driver = "oracle.jdbc.driver.OracleDriver";
	private final String driver = "com.mysql.jdbc.Driver";
	
	public Connection getConnection(String url, String user, String password){
		Connection conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
//			if(conn != null && !conn.isClosed()){
//				System.out.println("資料庫連線成功.");
//			}
		}catch (ClassNotFoundException e1){
			System.out.println("找不到連線類別檔案.");
		}catch (SQLException e2){
			System.out.println("資料庫無法連線!!");
		}
		return conn;
	}

}
