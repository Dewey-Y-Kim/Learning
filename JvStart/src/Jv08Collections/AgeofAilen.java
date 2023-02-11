package Jv08Collections;

public class AgeofAilen {

	public AgeofAilen() {
		// TODO Auto-generated constructor stub
	}
	public String solution(int age) {
		String answer = "";
		String ageStr=String.valueOf(age);
		for(int i=0; i<ageStr.length();i++) {
			answer+=(char)('a'+Integer.parseInt(String.valueOf(ageStr.charAt(i))));
		}
		return answer;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new AgeofAilen().solution(23);
	}

}
