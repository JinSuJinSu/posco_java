package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData1 {
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
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getString("name")+"학생은 "+rs.getInt("score")+"점 입니다.");
			}				
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		// try catch with 리소스 구문
		// try 안에 변수 선언 후 객체를 생성해서 대입시킬 수 있다. 이럴 경우 자동으로 close 가능
	}
}
