package Jv05Exception;

public class Ec02_userException extends Exception{
	/* 사용자 정의 예외 클래스 생성규칙
	 * 클래스명은  Exception을 마지막 단어로 합성
	 * api Exception || RuntimeException 중 하나를 상속받는다.
	 */
	public Ec02_userException() {
		// TODO Auto-generated constructor stub
		super("1~100사이의 값이 아닙니다.");
	}
	public Ec02_userException(String message) {
		super(message);
	}

}
