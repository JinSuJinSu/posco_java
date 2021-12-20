package mysql.level1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + e.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select ename, sal, hiredate from emp");
			while(rs.next()) {
				System.out.println(rs.getString("ename") + " , " + rs.getDate("hiredate") + " , "
						 + rs.getInt("sal"));
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(rs!=null)
				rs.close();
				if(stmt!=null)
				stmt.close();
				if (conn!=null)
				conn.close();
				// null 조건을 줘서 닫는 것이 더 정확한 개발이다.
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	
		
		
		
		// jDBC URL 규격
		// jdbc:mysql://[hostname]:[port]/[dbname][?param1=value1][&param2=value2"]...;

	}

}
