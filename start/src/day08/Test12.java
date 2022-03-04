package day08;

/*
 	문자와 출현 수를 기억한 배열들 10개를 관리하는 배열을 만들고
 	'A' ~ 'J' 를 랜덤하게 100번 반복해서 만들고 
 	배열에 카운트를 기억시켜서
 	결과를 출력하시오.
 */

public class Test12 {

	public static void main(String[] args) {
		int[][] num = new int[10][2];
		
		// 문자를 입력해본다.
//		num[0][0] = 'A';
//		num[1][0] = 'B';
		
		
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i][0] = 'A' + i;
		}
		
		// 랜덤하게 문자를 100번 발생시켜서  카운트를 올려준다.
		
		/*
		 	char ch = 'A'
		 	'A' ==> num[ch - 'A'][1] += 1;
		 */
		for(int i = 0 ; i < 100 ; i++) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			
			int idx = ch - 'A';
			
			int oldCount = num[idx][1];
			int newCount = oldCount + 1;
			num[ch - 'A'][1] = newCount;
			
		}
//		for(int i = 0 ; i < num.length ; i++) {
//			System.out.println("설정한 문자 " + (char)(num[i][0]) + "의 카운트 횟수는 " + num[i][1] + " 입니다.");
//		}
		for(int i = 0 ; i < num.length ; i++) {
			int[] arr = num[i];
			char ch = (char) arr[0] ; // 문자의 아스키 코드값을 꺼내서 강제 형변환
			int count = arr[1]; // 카운트 수
			
			// 타이틀 출력
			System.out.print(ch + " [ " + count + " ] : ");
			for(int j = 0 ;  j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
