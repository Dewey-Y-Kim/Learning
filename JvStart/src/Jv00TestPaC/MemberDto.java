package Jv00TestPaC;

public class MemberDto {

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	private String grade;
	private String userid;
	private String username;
	private String userphone;
	private String email;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		if (grade == "Admin") {return "";}
		else{return "[grade=" + grade + ", userid=" + userid + ", username=" + username + ", userphone="
				+ userphone + ", email=" + email + "]";}
	}
	
	
}
