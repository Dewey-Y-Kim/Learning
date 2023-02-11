package Jv08Collections;
import java.util.Enumeration;
import java.util.Properties;

public class Jv07_PropertiesTest {

	public Jv07_PropertiesTest() {
		// key 와 value를 문자열로만 처리하는 컬렉션
		Properties pro = new Properties();
		
		// 객체 추가...		key	,	value
		pro.setProperty("/seoul/index.do","/index.jsp");
		pro.setProperty("/test.do","/board/boardList.jsp");
		pro.setProperty("1111","22222");
		pro.setProperty("22222", "CCCC");
		/*
		// key 이용 value 가져오기
		System.out.println("/test.do : "+pro.getProperty("/test.do"));
		//	key가 있으면 가져오고 없으면 default 출력
		System.out.println("/notice.do : "+pro.getProperty("/notice.do","/error.jsp"));
		System.out.println("/seoul/index.do : "+pro.getProperty("/seoul/index.do","/error.jsp"));
		 */
		//모든 key 목록 구하기
		Enumeration keylist = pro.propertyNames();
		while(keylist.hasMoreElements()) {
			String key = (String)keylist.nextElement();
			String value = pro.getProperty(key);
			System.out.println(key+" = "+value);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv07_PropertiesTest();
	}

}
