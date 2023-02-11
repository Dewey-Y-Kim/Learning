package Jv11Oracle;

import java.sql.Types;
import java.util.Scanner;

public class Jv05_InsertProcedure extends DBConnect {
	Scanner sc = new Scanner(System.in);
	
	public Jv05_InsertProcedure() {
		// TODO 프로시져 확인필요
		
	}
	public void insertStart() {
		//콘솔에서 책정보를 입력받아 db에 등록하는 클래스
		// 책이름 가격 출판일 카테고리 작가명 출판사명
		System.out.print("도서명 : ");
		String bookname= sc.nextLine();
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.println("출판일(예: 2022-09-10) :");
		String pub_date = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("출판사명 : ");
		String pub_name = sc.nextLine();
		
		System.out.print("작가명 : ");
		String author_name = sc.nextLine();
		try {
		//DB연결
		DBConnection();
		//프로시져 호출 {call 프로시져이름(변수-매개변수 개수 동일하게)}
		sql = "{call bookInsert(?, ?, ?, ?, ?, ?, ?)}";
		
		cstmt= connection.prepareCall(sql);
		
		cstmt.setString(1, bookname);
		cstmt.setInt(2, price);
		cstmt.setString(3,pub_date);
		cstmt.setString(4,category);
		cstmt.setString(5, author_name);
		cstmt.setString(6, pub_name);
		cstmt.registerOutParameter(7, Types.INTEGER); //결과 획득
		
		
		
		
		//실행
		cstmt.executeUpdate();
		
		if( cstmt.getInt(7) > 0 ) {
			// 도서가 등록되었을 때
			System.out.println(bookname+"이 등록되었습니다.");
		} else {
			// 도서 등록을 못했을 때
			System.out.println(bookname+"이 등록되지 않았습니다.");
		}
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		} finally{
			DBClose();
		}
		
	}
	public static void main(String[] args) {
		// 책이름, 가격, 등록일, 카테고리, 출판사명, 작가명
		// bookname, price, pub_date,category,pub_name,author_name
		new Jv05_InsertProcedure().insertStart();
		
	}

}
