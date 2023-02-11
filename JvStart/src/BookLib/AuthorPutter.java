package BookLib;

import java.sql.SQLException;
import java.sql.Types;

public class AuthorPutter extends DbC{

	public AuthorPutter() {
		// TODO Auto-generated constructor stub
		
	}
	String name, debut,deYe,email,home;
	
	public void randomPutter() throws SQLException {
		sql="{call author_putter(?,?,?,?,?)}";
		cs=connect.prepareCall(sql);
		for (int i = 0; i<10; i++) {
			name=new RanData().huName();
			debut=new RanData().bookChooser();
			deYe= new RanData().dateAgo();
			email= new RanData().email();
			home= new RanData().homepage();
			cs.setString(1, name);
			cs.setString(2, debut);
			cs.setString(3, deYe);
			cs.setString(4, email);
			cs.setString(5, home);
			
			cs.executeUpdate();
		}
	}
	public void put() throws Exception  {
		
		sql="{call author_put(?,?,?,?,?,?)}";
		int result=0;
		for(int i=0; i<20;i++) {
			cs=connect.prepareCall(sql);
			System.out.println(sql);
			cs.setString(1, name);
			cs.setString(2, debut);
			cs.setString(3, deYe);
			cs.setString(4, email);
			cs.setString(5, home);
			cs.registerOutParameter(6, Types.INTEGER);
			
			cs.executeUpdate();
			
			if( cs.getInt(6)==0) {
				result=1;
			}
		}
		if(result==1) System.out.println("오류가 발생하였습니다.");
	}
	
	public void putter() {
		putter(1);
		}
	
	public void putter(int command) {
		Connect();
		
		try {
			if (command==0) {
				randomPutter();
			} else { 
				put();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}finally {
			DbClose();
		}
	}
	
	
	
	public static void main(String[] args) {
		new AuthorPutter().putter(1);
	}
}
