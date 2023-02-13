
public class AdminLogin {
	final String ID = "master";
	final String PW = "1234";
	public static String adminId=null;//로그인한 아이디
	private static String adminPw=null;//로그인한 비밀번호
	public static boolean logStatus=false;
	public AdminLogin() {
		// TODO Auto-generated constructor stub
	}
	public AdminLogin(String adminId,String adminPw) {
		// 로그인 ( master, 1234)
		if(adminId.equals(ID) && adminPw.equals(PW)) {
			logStatus = true;
			this.adminId = adminId;
			this.adminPw = adminPw;
		} else {
			this.adminId = null;
			this.adminPw = null;
			this.logStatus = false;
		}
		
	}
}
