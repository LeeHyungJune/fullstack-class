package day06.ex;

/*
 	ex 02)
 		두 사람이 등산을 한다.
 		한 사람은 산 입구에서 0.54m/s 의 속도로 등산을 시작하고
 		다른 한 사람은 1.07m/s 의 속도로 정상에서 내려온다.
 		만약 산의 높이가 7564m 라고 가정했을 때,
 		두 사람이 만나는 시점은 몇 분 몇 초 후인지 출력하시오.
 		
 		두 사람이 서로 지나쳤을 때 마주친 것이라고 가정.
 */

public class Ex02 {

	public static void main(String[] args) {
		
		int i = 0;
		double num = 0;
		double no = 0;
		int min = 0;
		int sec = 0;
		int hour = 0;
		
		for(i = 0 ; ; i++) { 
			num += 0.54;
			no = (double)(7564 - 1.07 * i);
			if(num >= no + 1) {
				hour = i / 3600;
				min = i / 60 % 60;
				sec = i % 60;
				break;
			}
		}
		
		System.out.println(hour + "시간, " + min + "분 , " + sec + "초");
		
	}

}
// 2,536.92,  5,026.86
