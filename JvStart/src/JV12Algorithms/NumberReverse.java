package JV12Algorithms;

public class NumberReverse {

	public NumberReverse() {
		
	}
	// api클래스를 이용한 숫자의 역순
	static void numberReverse(int data) {
		// 74747585  -> 58574747 
		// 123456    -> 654321
		
		// 정수형을 역순으로 처리한다.
		// 숫자 -> 문자     String.valueOf(123)  ,  123+""="123"
		// 문자 -> 숫자     Integer.parseInt("123")
		StringBuilder sb = new StringBuilder(String.valueOf(data));
		sb.reverse();
		System.out.println(Integer.parseInt(sb.toString()));		
	}
	//배열을 이용한 숫자의 역순
	static void numberReverseArray(int data) {
		StringReverseArray(String.valueOf(data));
	}
	
	static void StringReverseArray(String data) {
		 char c[] = data.toCharArray();   //배열로 만듬
		 //배열의 문자 교환
		 for(int i=0; i<c.length/2; i++) {// 0,1,2
			 // i  =   c.length-1-i
			 char temp = c[i];
			 c[i] = c[c.length-1-i];
			 c[c.length-1-i] = temp;
		 }
		 System.out.println(String.valueOf(c));
	}
	public static void main(String[] args) {
		// 클래스이용
		numberReverse(86152);
		// 배열이용
		numberReverseArray(215668);
		//
		StringReverseArray("JAVA ALGORITHM");
	}
}
