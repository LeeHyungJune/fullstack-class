package day03.ex;

public class Ex04a {
	public static void main(String[] args) {
		// 할일
		// 데이터 변수에 기억
		double total = 365.2426;
		// 누적계산될 변수 만들고
		double tmp = total;		
		// 날 수 구하고 --> 누적 변수에 계산해서 업데이트
		int day = (int) tmp;
		tmp = tmp - day;
		//tmp -= day;

		// 0.2426 을 초로 변환한다.
		// 1 * 24 ==> 하루의 시간
		// 0.5 * 24 ==> 하루 중 절반
		// 0.1 * 24 ==> 0.1일의 시간
		int tsec = (int)(0.2426 * 24 * 60 * 60);
		
		
		// 시간 구하고 -->  누적 변수에 계산해서 업데이트
		int hour = tsec / 60 / 60;
		
		tsec = tsec % (60 * 60);
		// tsec %= 3600;
		
		// 분 구하고 --> 누적 변수에 계산해서 업데이트
		int min = tsec / 60;
		
		tsec = tsec % 60;
		// tsec %= 60;
		
		// 초 구하고
		int sec = tsec;
		
		//출력하고
		System.out.println("1년은 " + total + " 일이고");
		System.out.println("이것은 " + day + " 일");
		System.out.println("       " + hour + " 시간");
		System.out.println("       " + min + " 분");
		System.out.println("       " + sec + " 초 이다.");
	}
}
