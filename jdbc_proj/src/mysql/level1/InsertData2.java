package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
			return;
		} 
		String url = "jdbc:mysql://localhost:3306/jdbcdb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("insert into student values (?, ?)");
				Scanner scan = new Scanner(System.in);){
			while(true) {
				System.out.print("�л� �̸��� �Է��ϼ��� : ");
				String name = scan.nextLine();
				System.out.print("�л� ������ �Է��ϼ��� : ");
				int score = Integer.parseInt(scan.nextLine());
				pstmt.setString(1,  name);
				pstmt.setInt(2, score);
				pstmt.executeUpdate();
				System.out.println("student ���̺� ������ ���� �Ϸ�");
				System.out.print("��� �Է��ϰڽ��ϱ�?(y/n)");
				String aws = scan.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				} 
				System.out.println("student ���̺� ������ ���� �۾� ����");
				break;
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} 
	}
}
