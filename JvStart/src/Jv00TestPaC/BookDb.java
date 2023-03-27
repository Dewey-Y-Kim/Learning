package Jv00TestPaC;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookDb {
	Scanner sc = new Scanner(System.in);
	
	public BookDb() {
		// TODO Auto-generated constructor stub
	}
	//DTO
	
	static ArrayList<BookDTO> library = new ArrayList<>();
	public boolean lengthChecker(int i, int j) {
		boolean boo;
		if(i<=j) boo = true; else boo=false;
		return boo;
	}
	public void inputBooks() {
		try {
		BookDTO newBook = new BookDTO();
		System.out.println("분류 : (1: 문학\t 2: 인문\t 3:경제경영\t 4:자기계발\t 5:과학 \t 6:취미 기타");
		String type=sc.next();
		int typeI= Integer.parseInt(type);
		System.out.print("\n코드 : ");
		String prico;
		switch(typeI){
		case 1 : prico ="A";break;
		case 2 : prico ="B";break;
		case 3 : prico ="C";break;
		case 4 : prico ="D";break;
		case 5 : prico ="E";break;
		default : prico ="F";break;
		}
		String code = sc.next(); //실제로는 스캐너
		boolean boo;
		boo = lengthChecker(code.length(),4);
		if(boo) {
			code=prico+code;
			newBook.setCode(code);
		}
		
		else{
			System.out.println("잘못된 코드입니다.");
			return;
		}

		newBook.setType(type);
		System.out.print("\n제목 : ");
		String title = sc.nextLine();
		newBook.setTitle(title);
		System.out.println("\n저자 : ");
		String writer = sc.nextLine();
		newBook.setWriter(writer);
		String publisher = sc.nextLine();
		System.out.println("\n출판사 : ");
		newBook.setPublisher(publisher);
		System.out.print("\n가격 : ");
		int cost = sc.nextInt();
		newBook.setCost(cost);
		library.add(newBook);
		
		} catch(InputMismatchException e) {
			System.out.println("초기화면으로 돌아갑니다.");
			return;
		}
	}
				
	public void listPrint() {
		cutLine("Book List");
		exit:{
			for(int i=0; i<library.size();i++) {
				BookDTO book = library.get(i); 
				book.toString();
				boolean conti=true;
				if ((i+1)%10 ==0) {
					do{
						cutLine(String.valueOf(i+1));
						System.out.print("0 :종료  1 : 다음");
						String sw = sc.next();
						int num;
						if(sw.equals("1")||sw.equals("0")) { 
						num =Integer.parseInt(sw);
						}else {
							num=3;
						}
						
						switch(num){
						
						default : continue;
						case 1 : conti=false;break;
						case 0 : break exit;
						}
					}while(conti);
					
				}
				
			}
		}
		cutLine("끝");
	}
			
	
	
	public void listSerch() {
		//도서 검색 type/title/writer/publisher/ code 위치
		int finder;
		boolean result = true;
		String str="";
		int i;
		do {
			System.out.print("도서를 검색합니다 \n(1. 분류\t 2. 제목 \t 3. 저자 \t 4. 출판사 \t 0: 종");
			String swi = sc.next();
			
			i =Integer.parseInt(swi.substring(1,1));
			switch(i) {
			case 1 : result = false; str = "분류 : (1: 문학\t 2: 인문\t 3:경제경영\t 4:자기계발\t 5:과학 \t 6:취미 기타 \n어떤 장르의 책을 찾을까요?";break;
			case 2 : result = false; str = "찾으시는 제목을 입력해주세요."; break;
			case 3 : result = false; str = "책의 저자를 입력해주세요."; break;
			case 4 : result = false; str = "책의 출판사를 입력해주세요."; break;
			case 0 : result = false; break;
			default :
			}
		}while(result);
		cutLine("도서검색");
		System.out.println(str);
		String keyword = sc.nextLine();
		String lib="";
		int t=1;
		li:for( BookDTO books : library) {
			t++;
			switch(i) {
			case 1 : lib = books.getType();break;
			case 2 : lib = books.getTitle(); break;
			case 3 : lib = books.getWriter(); break;
			case 4 : lib = books.getPublisher(); break;
			}
			if(lib.contains(keyword)) books.toString();
			if ((t+1)%10 ==0) {
				System.out.println("0 : 종료\t 1: 다음");
				boolean boo=true;
				do {
					String sel = sc.next();
					switch(Integer.parseInt(sel)) {
					case 1: boo=false;break;
					case 0: break li; 
					}
				}while(boo);
			}
		}
		
	}
			
							
	
	public void cutLine(String str) {
		System.out.printf("===========================================\t%10s\t================================================\n",str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	
}
