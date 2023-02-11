package Jv03Oop;
// 캡슐화된 멤버변수와 getter, setter메소드가 있는 데이터를 저장할수 있는 클래스
// 회원정보(아이디, 비빌번호, 이름, 연락처, email, 주소, 취미, 관심분야.......)
// 상품정보(상품명, 가격, 컬러, 사이즈, 할인율)
// DTO클래스(Data Transfer Object) - setter이용하여 데이터를 변경할 수 있다.

import Jv02API.String;

// VO클래스(Value Object) - readonly전용

public class MemberDTO {
	//캡슐화 변수
	private String userid;//null
	private String userpwd;
	private String username;
	private String tel;// 010-1234-5687   02-365-4584
	private String email;
	
	public MemberDTO() {		
	}
	public MemberDTO(String userid, String username, String tel) {
		this.userid = userid;
		this.username = username;
		this.tel = tel;
	}
	// 마우스 오른쪽 -> source -> generate toString
	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", tel=" + tel
				+ ", email=" + email + "]";
	}
	// 마우스 오른쪽 -> source -> generate getters and setters
	//getter
	public String getUserid() {
		return userid;
	}
	//setter
	public void setUserid(String userid) {
		this.userid = userid;		
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
