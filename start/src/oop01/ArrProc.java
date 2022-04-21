package oop01;



public class ArrProc {

	//	배열 초기화 함수
	public int[] initArr(int cnt) {
		/*
		 	이 함수는 아마도 호출하는 곳에서 넘겨주는 숫자를 가지고 
		 	배열을 만드는 작업을 해야 한다.	==>	입력데이터 존재.
		 	
		 	반환값을 만들어진 배열에 넘겨줘야 한다.
		 */
		
		//	반환값 변수
		/*
		int[] num = new int[cnt];
		return num;
		*/
		
		return new int[cnt];
	}
	
	//	배열 데이터 세팅 함수
	public void setArr(int[] no) {
		/*
		 	이 함수는 배열의 데이터를 셋팅해주는 함수인데
		 	어떤 배열을 세팅해야 하는지 알 수 없으므로 
		 	입력받아서 처리하기로 한다.
		 	
		 	이 함수를 호출하는 경우는
		 	ArrProc ap = new ArrProd();
		 	int[] num = ap.initArr(5);
		 	setArr(num);
		 */
		for(int i = 0 ; i < no.length ; i++) {
			//	랜덤하게 숫자 생성
			int num = (int)(Math.random()* 25 + 1);
			
			//	생성된 숫자 채우기
			no[i] = num;
		}
	}
	
	
	//	데이터 출력 함수
	public void printArr(int[] no) {
		System.out.print("| ");
		for(int i = 0 ; i < no.length ; i++) {
			System.out.print(no[i] + " | ");
		}
		System.out.println();
	}

}
