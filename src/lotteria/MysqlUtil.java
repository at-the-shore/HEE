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
//			127.0.0.1 : �ڱ��ڽ��� IP 
			String url = "jdbc:mysql://localhost/lotteria";
			conn = (Connection) DriverManager.getConnection(url, "root", "ielovejh");
//			System.out.println("���� ����"); // ���������� ������ �Ǿ��� ��
			Statement stmt = (Statement) conn.createStatement(); // ������ Ȱ���ϴ� statement
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
			System.out.println("����: " + e);
		} finally {
			try {
				if (conn != null && !conn.isClosed()) { // conn�� null�� �ƴϰų� conn�� �����ִ� ���
					conn.close(); // conn �� �ݾ��ش�
				}
			} catch (SQLException e) { // conn���� ������ ���� ���
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
			System.out.println("����: " + e);
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
