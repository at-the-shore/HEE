package lotteria;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class MysqlUtil {
	public static void init() {
		Connection conn = null;

		try {
			// xxx.xxx.xxx.xxx 0~255
//			xxxxxxx.xxxxxxx.xxxxxxx.xxxxxxx	
//			127.0.0.1 : 자기자신의 IP 
			String url = "jdbc:mysql://localhost/lotteria";
			conn = (Connection) DriverManager.getConnection(url, "root", "ielovejh");
//			System.out.println("연결 성공"); // 정상적으로 연결이 되었을 때
			Statement stmt = (Statement) conn.createStatement(); // 실제로 활동하는 statement
			ResultSet result = stmt.executeQuery("select * from drinkmenu");
			while (result.next()) {
				String name = result.getString(2);
				System.out.print(name + "\t"); // \t : tab
				int price = result.getInt(3);
				System.out.print(price + "\t");
				boolean isHot = result.getBoolean(4);
				System.out.println(isHot);
			}
		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				if (conn != null && !conn.isClosed()) { // conn이 null이 아니거나 conn이 닫혀있는 경우
					conn.close(); // conn 을 닫아준다
				}
			} catch (SQLException e) { // conn에서 문제가 있을 경우
				e.printStackTrace();
			}
		}
	}

	public static ResultSet getQueryResult(String query) {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost/lotteria";
			conn = (Connection) DriverManager.getConnection(url, "root", "ielovejh");
			Statement stmt = (Statement) conn.createStatement();
			return stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("에러: " + e);
			return null;
		} finally {
//			try {
//				if (conn != null && !conn.isClosed()) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		}
	}
}
