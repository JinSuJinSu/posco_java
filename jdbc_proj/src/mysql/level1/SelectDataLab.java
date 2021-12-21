package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataLab {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			return;
		} 
		String url = "jdbc:mysql://localhost:3306/jdbcdb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
			Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery("select id, name, title, "
					+ "date_format(meetingdate,\"%Y년 %c월 %e일 %H시 %i분\") as date from meeting");
			while(rs.next()) {
				System.out.println("[id가 " + rs.getInt("id") + "인 친구]");
				System.out.println("친구이름 : " + rs.getString("name"));
				System.out.println("미팅목적 : " + rs.getString("title"));
				System.out.println("미팅시간 : " + rs.getString("date"));
			}				
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		// try catch with 리소스 구문
		// try 안에 변수 선언 후 객체를 생성해서 대입시킬 수 있다. 이럴 경우 자동으로 close 가능
	}

}
