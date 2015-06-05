package external.II;

import java.sql.*;

/** 
寫 JDBC 程式的步驟: 
共有三個步驟 : 
1. 先拿到 driver，然後利用 driver 與 datrabase 建立連結。
2. 將 SQL 指令送到 database server 上。
3. 得到結果(results)，然後處理。
*/ 

public class SelectSql {

	// 修改下列 url 變數的設定
	// String url = "jdbc:odbc:driver={Microsoft Access Driver(*.mdb)};DBQ=C:\\eclipse2.1.3\\workspace\\JDBCTutorial\\MusicCD.mdb";
	// String tableName = "MusicCDDesc";
	
	String url = "jdbc:mysql://192.168.0.11:3308/wifiap";
	String user = "wifiap";
	String password = "jt87971980";
	String tableName = "users";
	private final String driver = "com.mysql.jdbc.Driver";
	
	public void doSelect() {
		try {
			// 1. 取得資料庫聯結
			Class.forName("driver");
			Connection conn = DriverManager.getConnection(url, user, password);

			// 2. 建立好 SQL 字串
			String selectSQL = "Select * from " + tableName;
			Statement stmt = conn.createStatement();

			// 3. 執行 SELECT. 要用 executeQuery
			ResultSet rs = stmt.executeQuery(selectSQL);

			// 4. 得到結果，處理
//			while (rs.next()) {
//				System.out.print(rs.getString("musicCDID"));
//				System.out.print(" " + rs.getString("singer"));
//				System.out.println(" " + rs.getString("title"));
//			}
			// 5. 一定要記得關閉連線
			conn.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

	public static void main(String[] args) {
		SelectSql ss = new SelectSql();
		ss.doSelect();
	}
}
