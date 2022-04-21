package githrd.dao;

import java.sql.*;
import java.util.*;

import githrd.db.JenyJDBC;
import githrd.sql.MemberSQL;
import githrd.vo.MemberVO;
import oracle.net.aso.r;


public class MemberDao {
	private JenyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new JenyJDBC();
		
		con = db.getCon();
		
		mSQL = new MemberSQL();
		
		
	}
	
	//	회원번호와 아이디를 조회해서 출력해주는 함수
	public ArrayList<MemberVO> getIdNo(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_IDNO);
		
		stmt = db.getStmt(con);
		
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				
				int mno = rs.getInt("mno");
				String id = rs.getString("id");
				
				mVO.setMno(mno);
				mVO.setId(id);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.close(rs);
				db.close(stmt);
				db.close(con);
			} catch (Exception e) {}
		}
		
		return list;
	}
	
	//	회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	public ArrayList<MemberVO> getMInfo(int mno) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		//	이미 드라이버로딩은 끝난 상태이므로 커넥션을 꺼내온다.
		con = db.getCon();
		
		//	질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_MINFO);
		
		// 명령 전달 도구 준비
		pstmt = db.getPstmt(con, sql);
		
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setPw(rs.getString("pw"));
				mVO.setMail(rs.getString("mail"));
				mVO.setTel(rs.getString("tel"));
				mVO.setAddr(rs.getString("addr"));
				mVO.setGen(rs.getString("gen"));
				mVO.setHdate(rs.getDate("hiredate"));
				mVO.setHtime(rs.getTime("hiredate"));
				mVO.setSdate();
				
				list.add(mVO);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
			} catch (Exception e) {}
		}
		return list;
	}
	
	//	아이디(jennie)를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수 
}
