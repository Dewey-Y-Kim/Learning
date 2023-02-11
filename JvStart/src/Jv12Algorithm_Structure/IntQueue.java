package Jv12Algorithm_Structure;

public class IntQueue {
	 private int max;//용량
	 private int front;// 앞쪽(디큐)위치
	 private int rear;// 뒤쪽(인큐)위치
	 private int num;//데이터의 수
	 
	 private int queue[];//queue처리할 배열
	 
	 public IntQueue() {
		 this(10);
	 }
	 public IntQueue(int capacity) {
		 num = front = rear = 0;
		 max = capacity;
		 try {
			 queue = new int[max];
		 }catch(OutOfMemoryError oome) {
			max = 0; 
		 }		 
	 }
	 // 인큐 : 큐의 마지막에 데이터 추가
	 public int enqueue(int data) {
		 //큐가 가득찼는지 확인 후 예외발생시킨다.
		 if(max == num) {
			 throw new OverflowIntQueueException();
		 }
		 //큐가 여유가 있을때
		 queue[rear++] = data;// rear의 위치에 데이터 담고 rear는 1증가
		 num++;//데이터수 증가
		 
		 // 용량과 rear가 같으면 배열의 범위를 벗어남.   rear초기화=0
		 if(max==rear) rear = 0;		 
		 return data;
	 }
	 //디큐 : 데이터 꺼내기, 지워짐
	 public int deque() {
		 //큐가 비어 있는지 확인
		 if(num == 0) 
			 throw new EmptyIntQueueException();
		 
		 // front의 값을 구하고 다음위치 값으로 설정하기위해 1증가한다.
		 int data = queue[front++];
		 num--;// 데이터의 갯수 감소
		 if(front==max) {
			 front = 0;
		 }		 
		 return data;
	 }
	 //peek : front위치의 데이터 구함. 값지워지지 않음
	 public int peek() {
		 if(num==0) {
			 throw new EmptyIntQueueException();
		 }
		 return queue[front];
	 }
	 // indexOf : 값이 있는위치
	 public int indexOf(int data) {
		 // 데이터가 있으면 index반환
		 // 데이터가 없으면 -1반환
		 //                                    f
		 for(int i=0; i<num; i++) { // 5-> 0,1,2,3,4  3->0,1,2
			 int idx = (front + i) % max;
			 if(queue[idx] == data)// index위치의 값이 찾는 값과 같을 때
				 return idx;
		 }
		 return -1;//찾는 값이 없을때
	 }
	 // 데이터 보기
	 public String dataView() {
		 String str = "";
		 for(int i=0; i<max; i++) {
			 str += "queue["+i+"]="+ queue[i];
			 if(i!= max-1) str += ",";
		 }
		 return str;
	 }
	 //**********************************************
	 public int capacity() {
		 return max;
	 }
	 public int size() {
		 return num;
	 }
	 public boolean isEmpty() {
		 if(num==0) {
			 return true;
		 }
		 return false;
	 }
	 public boolean isFull() {
		 if(num == max) {
			 return true;
		 }
		 return false;
	 }
	 // 마지막 값 꺼내기
	 public int peekLast() {
		 if(isEmpty()) {
			 return -1;
		 }
		 // rear의 이전위치의 값
		 int idx = rear - 1;
		 if(idx==-1) idx = max - 1;
		 
		 return queue[idx];
	 }
	 // 마지막 값을 꺼내고 지우기
	 public int pollLast() {
		 if(isEmpty()) {
			 return -1;
		 }
		 
		 int idx = rear - 1;
		 if(idx ==-1) idx = max -1;
		 
		 rear = idx;
		 num--;
		 return queue[idx];
	 }
	 //**********************************************
	 //--------------------------------------------------------
	 //오버플로우 예외 
	 public class OverflowIntQueueException extends RuntimeException{
		 public OverflowIntQueueException() {}
	 }
	 //Empth 예외
	 public class EmptyIntQueueException extends RuntimeException{
		 public EmptyIntQueueException() {}
	 }
}
