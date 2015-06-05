package database.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDropTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3308/wifiap";
		String user = "wifiap";
		String password = "jt87971980";
		
		String TABLENAME = "XXX_X1";
		String DROP_SQL = "DROP TABLE " + TABLENAME;

		Connection conn = null;
		Statement stmt = null;

		conn = new DBDriver().getConnection(url, user, password);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(DROP_SQL);
			System.out.println("! 刪除資料表," + TABLENAME + " OK !" );
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("!!!刪除資料表錯誤!!!");
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
