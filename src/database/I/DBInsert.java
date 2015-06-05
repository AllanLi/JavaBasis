package database.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsert {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3308/wifiap";
		String user = "wifiap";
		String password = "jt87971980";

		String TABLENAME = "XXX_X1";
		String INSERT_SQL = "INSERT INTO " + TABLENAME + " VALUES (2, 'GG', 'xxx')";

		Connection conn = null;
		Statement stmt = null;

		conn = new DBDriver().getConnection(url, user, password);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(INSERT_SQL);
			System.out.println("! 新增資料," + TABLENAME + " OK !");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("!!!新增資料表錯誤!!!");
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
