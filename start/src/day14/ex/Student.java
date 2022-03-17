package day14.ex;

public class Student {
	private int ban, kor, eng, math, sum;
	private String name;
	
	public Student() {}
	public Student(int ban, String name, int kor, int eng, int math) {
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		setSum();
	}
	public void setSum() {
		sum = kor + eng + math;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "이 학생의 반은 " + ban + "이고 이름은 " + name + ", 국어는 " 
				+ kor + "점, 수학은 " + math + "점, 영어는 " + eng + "점, 총점은 " + sum + " 입니다."; 
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Student nam = null;
		try {
			nam = (Student) o;
		} catch(Exception e) {
			
		}
		
		int nban = nam.getBan();
		String nname = nam.getName();
		
		bool = nban == ban && nname == name;
		
		
		return bool;
	}
}
