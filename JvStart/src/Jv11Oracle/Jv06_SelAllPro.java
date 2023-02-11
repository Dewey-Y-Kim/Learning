package Jv11Oracle;



import java.sql.ResultSet;

import oracle.jdbc.internal.OracleTypes;

public class Jv06_SelAllPro extends DBConnect {

	public Jv06_SelAllPro() {
		// TODO Auto-generated constructor stub
	}
	public void selectAllStart() {
		try {
			DBConnection();
			
			sql="{call book_all_select(?)";
			cstmt=connection.prepareCall(sql);
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			// 실행
			cstmt.executeLargeUpdate();
			// 첫번째 ?에 담긴 레코드를 꺼내기
			rs=(ResultSet)cstmt.getObject(1);
			//b.isbn, b.bookname, b.price, b.pub_date, b.category, a.author_name, p.pub_name 
			
			while(rs.next()) {
				System.out.printf("%d\t%s\t%d\t%s\t%s\t%s\t%s", rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),
						rs.getString(5),rs.getString(6),rs.getString(7));
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBClose();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv06_SelAllPro().selectAllStart();
	}

}
