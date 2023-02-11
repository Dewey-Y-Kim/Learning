package Jv08Collections;
import java.util.Scanner;

public class Jv03_LinkedListMain {

	public Jv03_LinkedListMain() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		Jv03_LinkedListTest llt= new Jv03_LinkedListTest();
		Scanner sc=new Scanner(System.in);
		
		boolean swit = true;
		do {
			try {
			System.out.println("메뉴선택 [1: In , 2: Out , 0:finish]");
			// 1 : numDTO 객체 만들어 LinkedList 추가
			// 2 : LinkedList에서 제일 앞에 있는 객체 꺼내기
			int menu = sc.nextInt();
			switch(menu) {
			case 1:llt.inGuest();break;
			case 2:llt.outGuest();break;
			case 0:swit=false;break;
			default:System.out.println("메뉴를 잘못 입력 했습니다.");
			}
			}catch(Exception e) {
				System.out.println("메뉴를 잘못 입력 했습니다.");
			}
		}while(swit);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv03_LinkedListMain().start();
	}

}
