package external.II;

import java.sql.*;

public class TmpSql {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/資料庫名稱", "帳號", "密碼");

			System.out.println("資料庫連線成功");

		} catch (ClassNotFoundException e) {

			System.out.println("找不到連線類別檔案");

		} catch (SQLException e) {

			System.out.println("資料庫無法連線!!!");
			System.out.println("請檢查帳號及密碼是否有誤，");
			System.out.println("或者mysql服務是否關閉。");
		}
	}
}
