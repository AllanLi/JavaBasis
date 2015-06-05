package external.II;

import java.sql.*;

public class AnyiConnect {
public static void main(String[] args) {
		
		String url = "jdbc:mysql://192.168.0.11:3308/wifiap";
		String user = "wifiap";
		String password = "jt87971980";
		
		String SELECT_COUNT = "select * from users; ";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		conn = new AnyiDB().getConnection(url, user, password);
		try {
			
			pstmt = conn.prepareStatement(SELECT_COUNT);
			rs = pstmt.executeQuery();
			System.out.println( SELECT_COUNT );
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(!rs.isClosed()) rs.close();
				if(!pstmt.isClosed()) pstmt.close();
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}



	}

}