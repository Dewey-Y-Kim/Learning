package Jv11Oracle;

import java.sql.ResultSet;
import java.util.Scanner;

import oracle.jdbc.internal.OracleTypes;


public class SelectSearchProcedure extends DBConnect {

	public SelectSearchProcedure() {
		// TODO Auto-generated constructor stub
	}
	Scanner sc = new Scanner(System.in);
	
	public void searchStart() {
		while(true) {
			try {
				System.out.print("검색할 도서명 :");
				String word = sc.nextLine();
				DBConnection();
				sql = "{call book_search(?, ?)";
				
				cstmt = connection.prepareCall(sql);
				cstmt.setString(1, word);
				cstmt.registerOutParameter(2, OracleTypes.CURSOR);
				
				cstmt.executeLargeUpdate();
				rs=(ResultSet)cstmt.getObject(2);
				while(rs.next()) {
					System.out.printf("%d, %s, %d, %s, %s\n", rs.getInt(1), rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5));
					}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBClose();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectSearchProcedure().searchStart();
	}

}
