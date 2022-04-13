package empProj.controller;

import java.util.Scanner;

import empProj.view.*;

public class EmpController03 {
/*
 	사원번호와 사원이름을 조회해서 출력해주고
 	사원번호를 입력하면
 	해당 사원의 
 		사원번호, 사원이름, 직급, 급여, 입사일
 	을 조회해서 출력해주는 기능을 추가하시오. 사원번호, 사원이름을 뽑아주는 리스트. 
 	
 */
	private EmpView view;
	
	public EmpController03() {
		Scanner sc = new Scanner(System.in);
		view = new EmpView();
		view.empPrint();
		System.out.println();
		view.empInfoPrint(sc);
		
	}

	public static void main(String[] args) {
		new EmpController03();
	}

}
