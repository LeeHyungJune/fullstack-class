package day08;

/*
 	0 ~ 9 사이의 숫자를 100개 발생시켜서
 	각각의 숫자가 몇 번씩 발생했는지를 알아보자.
 	
 	방법)
 		각 숫자의 횟수를 기억할 배열을 만들고
 		각 숫자가 발생할 때마다 1 씩 누적시켜준다.
 */

public class Test01 {

	public static void main(String[] args) {
		// 할일
		// 배열 생성
		int[] numCount = new int[10]; // 각 방에는 초기값으로 0으로 셋팅 되어 있다
		/*
		 	이 배열에 위치값이
		 		0인 위치에는 0이 발생하면 1을 누적시킨다.
		 		1인 위치에는 1이 발생하면 1을 누적시킨다.
		 		...
		 */
		
		// 반복작업
		for(int i = 0 ; i < 100 ; i++) {
			// 랜덤하게 숫자를 발생
			int no = (int)(Math.random() * 10);
			// 이렇게 위에서 발생된 숫자는 위에 만든 numCount 배열의 위치값으로 사용하고
			// 그 위치값의 숫자를 1을 증가시켜주면 된다.
			// 발생된 숫자의 카운트를 + 1
			numCount[no] += 1;
		}
		
		// 결과 출력
		// 숫자로 출력
		for(int i = 0 ; i < numCount.length ; i++) {
			int no = i; // 숫자
			int count = numCount[i]; // 발생한 횟수
			System.out.println(no + " : " + count);
		}
		// 발생한 횟수를 특수문자를 이용해서 그래프 형태로 출력
		for(int i = 0 ; i < numCount.length ; i++) {
			int count = numCount[i];
			System.out.print(i + " : ");
			// 숫자 출력
			// count 횟수 만큼 특수문자를 출력해야 하므로 반복문으로 처리
			for(int j = 0 ; j < count ; j++) {
				// ♣ 출력
				System.out.print("♣");
			}
			System.out.println();
		}
		
	}

}
