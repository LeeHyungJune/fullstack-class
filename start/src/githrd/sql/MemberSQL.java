package githrd.sql;

public class MemberSQL {
	//	코드변수
	public final int SEL_IDNO = 1001;
	
	public final int SEL_MINFO = 2001;
	
	public final int SEL_ATEL = 3001;
	
	// 질의명령을 기억하고 있다가 요청하면 반환해주는 함수
	public String getSQL(int code) {
		
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_IDNO:
			buff.append("SELECT ");
			buff.append("	mno, id ");
			buff.append("FROM ");
			buff.append("	MEMBER ");
			break;
		case SEL_MINFO:
			buff.append("SELECT ");
			buff.append("	* ");
			buff.append("FROM ");
			buff.append("	MEMBER ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");		
			break;
		case SEL_ATEL:
			buff.append("UPDATE MEMBER ");
			buff.append("SET TEL = '010-1212-1212' ");
			buff.append("WHERE ID = '?' ");
			break;
		}
		
		return buff.toString();
	}
}
