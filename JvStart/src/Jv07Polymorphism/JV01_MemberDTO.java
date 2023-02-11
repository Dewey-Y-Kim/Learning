package Jv07Polymorphism;
/* 
 * 캡슐화된 맴버변수와 getter, setter 메소드가 있는 데이터를 저장할 수 있는 클래스
 * DTO클레스(Data transfer Object) - Setter를 이용하여 데이터를 변경 할 수 있다.
 * 
 * VO클래스(Value Object - readonly전용
 * 
 * 
*/
public class JV01_MemberDTO {
	//캡슐화 변수
	private String userid;
	private String passwd;
	private String name;
	private String tel;
	private String email;
	
	public JV01_MemberDTO() {
		// 회원정보 - 아이디,이름,연락처. email,주소, 취미, 관심분야.........
		// 상품정보 - 상품명, 상품코드, 가격, 컬러, 할인률, 무게, 크기.......
	}
	public JV01_MemberDTO(String userid,String passwd, String name, String tel, String email) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	// source - generate toString
	@Override
	public String toString() {
		return "Jv01_MemberDTO [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", tel=" + tel
				+ ", email=" + email + "]";
	}



	// getter
	public String getUserid() {
		return userid;
	}
	// setter
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
