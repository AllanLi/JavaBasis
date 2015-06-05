package external.II;

import java.sql.*;

/**
 * 寫 JDBC 程式的步驟: 共有三個步驟 : 1. 先拿到 driver，然後利用 driver 與 datrabase 建立連結。 2. 將 SQL
 * 指令送到 database server 上。 3. 得到結果(results)，然後處理。
 */

public class InsertSql {
	// 修改下列 url 變數的設定
	// String url =
	// "jdbc:odbc:driver={Microsoft Access Driver(*.mdb)};DBQ=C:\\eclipse2.1.3\\workspace\\JDBCTutorial\\MusicCD.mdb";
	// String tableName = "Member";

	String url = "";
	String tableName = "";

	public void doInsert() {
		try {
			// 1. 取得資料庫聯結
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(url, "", "");

			// 2. 建立好 SQL 字串
			String insertSQL = "Insert into " + tableName
					+ " (Gender, Name, Address, Email, Zipcode) values "
					+ "('M', 'xyz1', '永康市大灣路 100 號', 'test@yahoo.com', '701')";

			// 3. 執行 INSERT. 要用 executeUpdate
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(insertSQL);

			// 4. 一定要記得關閉
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InsertSql ss = new InsertSql();
		ss.doInsert();
	}
}
