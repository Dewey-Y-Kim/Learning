package Member;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.DbC;

public class MemberDAO extends DbC {
	
	public MemberDAO() {
		// TODO Auto-generated constructor stub
	}
	public static MemberDAO getInstance() {
		return new MemberDAO();
	}
	//insert method : 회원등록
	public int memberwrite(MemberDTO dto) {
		Connect();
		int result=0;
		//st
		sql="insert into member(no, username, tel, email, addr) values (mem_sq.nextval, ?, ?, ?, ?)";
		try {
			ps = connect.prepareStatement(sql);
			
			ps.setString(1, dto.getUsername());
			ps.setString(2, dto.getTel());
			ps.setString(3, dto.getEmail());
			ps.setString(4, dto.getAddr());
			
			result = ps.executeUpdate();

		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		} finally {
			DbClose();
		}
		return result;
	}
	public int memberUpdate(String username, int item, String data) {
		int result= 0;
		try {
			Connect();
			sql = "update member set ";
			switch(item) {
				case 1: sql+="tel ";break;
				case 2: sql+="eamil ";break;
				case 3: sql+="addr "; break;
			}
			sql += "=? where username =?";
			
			ps=connect.prepareStatement(sql);
			ps.setString(1, data);
			ps.setString(2, username);
			
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbClose();
		}
		return result;
	}
	public List<MemberDTO> memberAll() {
		List<MemberDTO> list =new ArrayList<MemberDTO>();
		int result=0;
		sql = "Select no, username, tel, email, addr, to_char(writedate, 'YYYY-MM-DD') writedate from member order by no";
		try {
			Connect();
			ps=connect.prepareStatement(sql);
			
			rs= ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setNo(rs.getInt(1));
				dto.setUsername(rs.getString(2));
				dto.setTel(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setAddr(rs.getString(5));
				dto.setWritedate(rs.getString(6));
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbClose();
		}
		return list;
	}
	//4.delelte
	public int memberDelete(int no) {
		int result=0;
		try {
			Connect();
			sql="delete from member where no=?";
			
			ps=connect.prepareStatement(sql);
			ps.setInt(1, no);
			
			result=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbClose();
		}
		return result;
	}
	
	//5.
	public List<MemberDTO> Searchselect(String keyword){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			Connect();
			sql = "Select no, username, tel, email, addr, to_char(writedate,'YYYY-MM-DD') writedate from member where username like ? or tel like ?";
			
			ps = connect.prepareStatement(sql);
			ps.setString(1,"%"+keyword+"%");
			ps.setString(2,"%"+keyword+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setNo(rs.getInt(1));
				dto.setUsername(rs.getString(2));
				dto.setTel(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setAddr(rs.getString(5));
				dto.setWritedate(rs.getString(6));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbClose();
		}
		return list;
	}
}
