package day13;


import java.util.Arrays;
public class Ex01 {
/*
 	String[] arr = {"123", "456", "789", ...};
 	가 있는 경우
 	이 배열이 기억하는 숫자형태의 문자열을 정수로 바꾼 데이터들의
 	합과 평균을 구하는 프로그램을 작성하시오,
 	
 	단, 발생할 수 있는 예외를 가정하여 모두 처리하시오.
 		1.	배열의 범위를 벗어나서 사용한 경우
 		2. 	숫자로 변환이 불가능한 경우
 		3.	평균을 계산하는데 0으로 나누는 경우
 		4.	위의 세가지 이외의 경우 catch (Exception e)
 */
	String[] strings;	
	public Ex01() {
		setArr();
		
		toPrint();
		
	}

	public void setArr() {
		
		String[] strings = {"123", "456", "789"};
		
		int[] nums = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
		
		int sum = 0;
		
		double avg = 0;
		
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
			avg = sum / nums.length;
		}
		
	}
	
	public void toPrint() {
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
