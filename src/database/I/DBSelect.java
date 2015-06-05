package database.I;

import java.sql.*;

public class DBSelect {
	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.11:3308/wifiap";
		//String url = "jdbc:mysql://127.0.0.1:3308/wifiap";
		String user = "wifiap";
		String password = "jt87971980";
		
		String tableName = "users";		
		String SELECT_SQL = "select * from " + tableName;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = new DBDriver().getConnection(url, user, password);
		try {
			pstmt = conn.prepareStatement(SELECT_SQL);
			rs = pstmt.executeQuery(SELECT_SQL);
			while (rs.next()) {
				System.out.print(rs.getString("ID"));
				System.out.print(rs.getString("ROLE_ID"));
				System.out.print(rs.getString("DESCRIPTION"));
				System.out.print(rs.getString("MODIFIED_USER"));
				System.out.println(rs.getString("MODIFIED_TIME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("select 錯誤!!");
		} finally {
			try {
				if (!rs.isClosed())
					rs.close();
				if (!pstmt.isClosed())
					pstmt.close();
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
