package database.I;

import java.sql.*;
/* * * * * * * * 
 * * 尚未完成  * * * 
 * * * * * * * */
public class DBCRUD {
	// 連線參數
	String url = "jdbc:mysql://127.0.0.1:3308/wifiap";
	String user = "wifiap";
	String password = "jt87971980";

	// 連線 object	
	Connection conn = null;
	
	// SQL指令,建議僅用於查詢較快
	private Statement stmt = null;
	// SQL指令,可自訂參數,建議使用
	private PreparedStatement pstmt = null;
	// 結果集
	private ResultSet rs = null;

	// SQL指令
	//TABLE_USER = XXX;
	//private String dropdbSQL = "DROP TABLE User ";
	//private String createdbSQL = "CREATE TABLE UserXXX (" + "    id     INTEGER "+ "  , name    VARCHAR(20) " + "  , passwd  VARCHAR(20))";
	private String createdbSQL = "CREATE TABLE UserXXX (id INTEGER, name VARCHAR(20), passwd VARCHAR(20))";
	//private String insertdbSQL = "insert into User(id,name,passwd) "		+ "select ifNULL(max(id),0)+1,?,? FROM User";
	//private String selectSQL = "select * from User ";

	
//	public DBCRUD() {
//		try {
//			// 註冊driver
//			//Class.forName("com.mysql.jdbc.Driver");
//			// 取得connection
//			conn = new DBdriver().getConnection(url, user, password);
//
//		} finally {
//			try {
//				if (!rs.isClosed())
//					rs.close();
//				if (!pstmt.isClosed())
//					pstmt.close();
//				if (!conn.isClosed())
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	// 建立 Table
	// 使用 Statement 方式
	public void createTable() {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(createdbSQL);
			System.out.println("建立資料表");
		} catch (SQLException e) {
			System.out.println("建立 Table ：" + e.toString());
		} finally {
			try{
				if(!rs.isClosed()) rs.close();
				if(!pstmt.isClosed()) pstmt.close();
				if(!conn.isClosed()) conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
