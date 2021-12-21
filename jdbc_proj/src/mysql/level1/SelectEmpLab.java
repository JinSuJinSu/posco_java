package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {
	
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
			
			boolean randomBoolean = new Random().nextBoolean();
			
			//randomBoolean true, false일때 쿼리문을 나눈다.
			
			if(randomBoolean) {
				rs = stmt.executeQuery("select ename, format(sal,0) from emp");
			
			
				while(rs.next()) {
				System.out.println(rs.getString("ename") + " 직원의 월급은 " +
						 rs.getString("format(sal,0)") + "원입니다.");
			}
			}
			else {
				rs = stmt.executeQuery("select ename, year(hiredate), month(hiredate),"
						+ " day(hiredate) from emp order by hiredate");
				
				while(rs.next()) {
				System.out.println(rs.getString("ename") + " 직원은 " +
						 rs.getString("year(hiredate)") + "년 " + rs.getString("month(hiredate)") + "월 " + 
						 rs.getString("day(hiredate)") + "일에 입사하였습니다.");
				//date_format(hiredate,\"%Y년 %m월 %d일\") as date
				// rs.getString("date");
			}
				
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


	}

}
