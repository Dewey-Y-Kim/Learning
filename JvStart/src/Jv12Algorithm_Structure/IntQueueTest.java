package Jv12Algorithm_Structure;

import java.util.Scanner;
public class IntQueueTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntQueue que = new IntQueue(5);//큐생성하기
		
		while(true) {
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)데이터보기 (6)indexOf (0)종료 :");
			int menu = scan.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			switch(menu) {
			case 1: // 인큐:데이터를 큐의 끝에 추가하기
				System.out.print("추가할 데이터 : ");
				int data = scan.nextInt();
				try {
					que.enqueue(data);
				}catch(IntQueue.OverflowIntQueueException o) {
					System.out.println("큐가 가득찼습니다.");
				}
				break;
			case 2:
				try {
					int dequeData = que.deque();
					System.out.println("큐의 제일앞 값 : "+ dequeData);
				}catch(IntQueue.EmptyIntQueueException eiqe) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
			case 3: //peek : 제일 앞데이터 가져오기
				try {
					int firstData = que.peek();
					System.out.println("큐의 제일앞 값 : "+ firstData);
				}catch(IntQueue.EmptyIntQueueException eiwe) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				System.out.println("용량 : "+ que.capacity());//큐의 용량
				System.out.println("데이터수 : "+ que.size());//데이터의 수
				System.out.println("Empty : "+ que.isEmpty()); //큐가 비어있는지
				System.out.println("Full : "+ que.isFull());//큐가 가득찼는지
				System.out.println("마지막값 : "+ que.peekLast());//큐의 제일 마지막 데이터 가지고 나오기
				System.out.println("마지막값(Remove) : "+ que.pollLast());//큐의 제일 마지막 데이터 가지고 나오기 지우기	
				break;
			case 5:
				System.out.println(que.dataView());
				break;
			case 6:
				System.out.print("찾을 값 : ");
				int searchData = scan.nextInt();
				int index = que.indexOf(searchData);
				if(index>=0) {
					System.out.println(index+"위치에 "+searchData+"가 있습니다.");
				}else {
					System.out.println(searchData+"는 큐에 존재하지 않습니다.");
				}
				break;
			default : 
				System.out.println("메뉴를 잘못선택하였습니다.");
			}
		}
		
	}

}
