package Jv12Algorithm_Structure;

public class IntStack {
	int max;//스택의 크기 - 스택에 넣을수 있는 데이터의 갯수
	int pointer;//스택의 포인터 - 스택에 쌓여 있는 데이터의 수
	int stack[];// null
	public IntStack() {			
		//배열(스택)의 크기를 설정하지 않을 경우 정수 20개의 데이터를 저장할수 있도록 배열을 생성한다.	
		this(20);		
	}
	public IntStack(int capacity) {
		try {
			//배열(스택)의 크기를 설정하지 않을 경우 정수 20개의 데이터를 저장할수 있도록 배열을 생성한다.
			stack = new int[capacity];
			max = capacity;
			pointer = 0 ;
		}catch(OutOfMemoryError oome) {
			max = 0; //스택의 크기를 초기화
		}
	}
	///////////////////////////////////////////
	//실행시 스택에 데이터가 넘칠때 발생시킬 예외 클래스
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//실행시 스택이 비어있는 상태에서 pop()을 하면 발생시킬 예외 클래스
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	///////////////////////////////////////////
	//데이터의 수
	public int size() {
		return pointer;
	}
	//스택의 크기 : 확보된 메모리의 크기
	public int capacity() {
		return max;
	}
	public boolean isEmpty() {
		return pointer <= 0;
	}
	public boolean isFull() {
		return pointer == max;
	}
	//데이터담기
	public int push(int data) throws OverflowIntStackException{
		//스택이 오버플로우 일때 데이터를 푸시하면 예외발생시킴
		if(max<=pointer) {
			throw new OverflowIntStackException();
		}		
		return stack[pointer++] = data;	
	}
	//데이터꺼내기
	public int pop() throws EmptyIntStackException{
		if(pointer<=0) {
			throw new EmptyIntStackException();
		}
		return stack[--pointer];
	}
	//스택의 top데이터 확인
	public int peek() throws EmptyIntStackException{
		if(pointer<=0) {
			throw new EmptyIntStackException();
		}
		return stack[pointer-1];
	}
	//스택의 모든 데이터를 정상부터 출력하는 메소드
	public String dump() {
		/*
		if(pointer<=0) {//스택이 비어 있는 경우
			System.out.println("데이터가 없습니다.");
		}else {//스택에 데이터가 있는 경우
			for(int i=pointer-1; i>=0; i--) {// 9,8,7,6,...0
				System.out.print(stack[i]+ " ");
			}
			System.out.println();
		}*/
		//  [8,9,0]   []    [8]
		String stackStr = "[";
		for(int i=pointer-1; i>=0; i--) {
			stackStr += stack[i];
			if(i>0) {
				stackStr += ", ";
			}
		}
		stackStr += "]";
		//System.out.println(stackStr);
		return stackStr;
	}
	// search - 찾는 수의 index
	public int indexOf(int data) {
		for(int i=pointer-1; i>=0; i--) {
			if(stack[i]==data) {
				return i;
			}
		}
		return -1;// 찾는 값이 존재하지 않을때 
	}
	// remove - 데이터 삭제
	public boolean remove(int data) {
		//비어 있을때
		if(isEmpty()) return false;
		
		//스택이 비어 있지 않을때
		int idx = indexOf(data);
		// 값이 스택에 없다.
		if( idx == -1) return false;
		
		//값이 스택에 있다. 
		pointer--;//4
		for(int i = idx ; i < pointer ; i++) { // 3,4,5
			//    2          3
			//    3          4
			stack[i] = stack[i+1];
		}
		return true;
	}
	// clear - 스택 비우기
	public void clear() {
		// 스택은 pointer를 이용하여 데이터의 위치와 수를 정하기 때문에
		// pointer 값을 초기화 하면된다.
		pointer = 0;
	}
}
