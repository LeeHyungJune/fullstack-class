package empProj.controller;

import java.util.ArrayList;

import empProj.dao.EmpDao02;
import empProj.vo.EmpVO;

public class EmpController {
	private EmpDao02 eDao;

	
	public EmpController() {
		eDao = new EmpDao02();
		
		eDao.getAll();
		
		//	모든 사원의 정보를 조회
		
		ArrayList<EmpVO> list = eDao.getAll();
		System.out.println(list);
		for(EmpVO e : list) {
			System.out.println(e);
		}
		
		//	20 부서를 입력해서 부서원들의 정보를 조회
		
		//	SALESMAN 직급을 가진 사원들의 정보 조회
	}

	public static void main(String[] args) {
		new EmpController();
	}

}
