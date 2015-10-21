package database.I;

import java.sql.*;
/*
 * 
 * 建立資料表
 */
public class DBCreateTable {
	public static void main(String[] args) {
//		String url = "jdbc:mysql://127.0.0.1:3308/wifiap";
//		String user = "wifiap";
//		String password = "jt87971980";
		
		/** free mysql hosting 2015-10-21 */ 
		String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql693777";
		String user = "sql693777";
		String password = "uD8!pS3%";
		
		String TABLENAME = "t_db_2";
		String CREATE_SQL = "CREATE TABLE " + TABLENAME + "(ID INT, NAME VARCHAR(20), PASSWD VARCHAR(40))" ;

		Connection conn = null;
		Statement stmt = null;

		conn = new DBDriver().getConnection(url, user, password);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(CREATE_SQL);
			System.out.println("! 建立資料表," + TABLENAME + " OK !" );
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("!!!建立資料表錯誤!!!");
		} finally {
			try {
				if (!stmt.isClosed())
					stmt.close();
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

