package day10.ex;

/*
 	Ex01)
 		다음 변수를 가지는 Student 클래스를 제작하시오.
 		
 		String name;
 		int ban, no, kor, eng, math;
 		
 		클래스를 만들고
 		
 		Ex01 클래스에서
 			한 명의 데이터를 입력해서 출력하기
 			5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
 			
 		1. 한 개의 함수 내에서 처리하기
 		2. 기능별로 분리해서 함수 만들어서 처리
 			
 			
 		보너스 )
 			int rank, total;
 			double avg;
 */

public class Ex01 {
	String[] names;
	int[] bans;
	int[] nos;
	int[] kors;
	int[] engs;
	int[] maths;
	int[] totals;
	int[] ranks;
	double[] avgs;
	Student[] stud;
	
	public Ex01() {
		setData();
		
		setStudent();
		
		toPrint();
	}
	
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수", "둘리"};
		bans = new int[5];
		nos = new int[5];
		kors = new int[5];
		engs = new int[5];
		maths = new int[5];
		totals = new int[5];
		ranks = new int[5];
		avgs = new double[5];
		for(int i = 0 ; i < 5 ; i++) {
			bans[i] = (int)(Math.random() * (7 - 1 + 1) + 1);
			nos[i] = (int)(Math.random() * (30 - 1 + 1) + 1);
			kors[i] = (int)(Math.random() * (100 - 80 + 1) + 80);
			engs[i] = (int)(Math.random() * (100 - 80 + 1) + 80);
			maths[i] = (int)(Math.random() * (100 - 80 + 1) + 80);
			totals[i] = kors[i] + engs[i] + maths[i];
			avgs[i] = totals[i] / 3;
			ranks[i] = 1;
			for(int j = 0; j < 5 ; j++) {
				if(totals[i] < totals[j]) {
					ranks[i] += 1;
				}
			}
		}
		
	}
	
	public void setStudent() {
		stud = new Student[5];
		
		for(int i = 0 ; i < stud.length; i++) {
			stud[i] = new Student();
		}
		for(int i = 0 ; i < stud.length ; i++) {
			Student s = stud[i];
			s.setName(names[i]);
			s.setBan(bans[i]);
			s.setNo(nos[i]);
			s.setKor(kors[i]);
			s.setEng(engs[i]);
			s.setMath(maths[i]);
			s.setTotal(totals[i]);
			s.setAvg(avgs[i]);
			s.setRank(ranks[i]);
		}
		
	}
	
	public void toPrint() {
		for(int i = 0 ; i < stud.length ; i++) {
			String name = stud[i].getName();
			int ban = stud[i].getBan();
			int no = stud[i].getNo();
			int kor = stud[i].getKor();
			int eng = stud[i].getEng();
			int math = stud[i].getMath();
			int total = stud[i].getTotal();
			double avg = stud[i].getAvg();
			int rank = stud[i].getRank();
			
			System.out.println("이름 : " + name);
			System.out.println("반 : " + ban);
			System.out.println("번호 : " + no);
			System.out.println("국어성적 : " + kor);
			System.out.println("영어성적 : " + eng);
			System.out.println("수학성적 : " + math);
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("순위 : " + rank);
			System.out.println();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01();

	}
	
}
