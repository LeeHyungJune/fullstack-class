package githrd.controller;

import githrd.dao.*;

import java.util.*;

public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
	}
	
	//	회원번호와 아이디를 조회해서 출력해주는 함수
	
	
	//	회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	
	//	아이디(jennie)를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	
	//	[선택]Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	/*
	  	문제 )
	  		회원리스트를 꺼내오는데
	  		한 페이지당 3명의 아이디, 메일, 가입일 을 리스트 형식으로 보여주고
	  		그 중에서 한 명의 아이디를 입력하면
	  		그 회원의 상세데이터를 보여주는 기능을 구현하시오.
	  		
	  		한 페이지당 보여주는 리스트의 갯수는 3개로 하고
	  		한 페이지 당 보여지는 페이지 수는 3개로 한다.
	  		이전, 다음 페이지를 같이 표현해서
	  		이동가능한 페이지 메뉴는 총 5개로 하시오
	  		이전 페이지를 누르면 현재 보는 페이지가 5페이지라면
	  		3 페이지로 이동을 하고
	  		이동가능한 페이지는 1 ~ 3 로 변경되어야 한다.
	  		보여지는 페이지는 4페이지가 되고
	  		현재 보는 페이지가 4페이지가 되고 종료페이지는 6페이지가 되어야 한다.
	 
	 */
	
	
	public static void main(String[] args) {
		new MemberController();
	}

}
