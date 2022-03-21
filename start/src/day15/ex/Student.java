package day15.ex;

public class Student implements Comparable{
	private String name;
	private	int ban, num, java, db, web, spring, sum;
	private double avg;
	
	public Student() {}
	
	public Student(String name, int ban, int num, int java, int db, int web, int spring) {
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.java = java;
		this.db = db;
		this.web = web;
		this.spring = spring;
		setSum(java + db + web + spring);
		setAvg(sum / 4.0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


	
	@Override 
	public int compareTo(Object o) {
		int result = 0;
		
		result = ban - ((Student)o).getBan();
		if(result == 0) {
			result = num - ((Student)o).getNum();
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return String.format("이 학생의 이름은 %5s, 반은 %3d, 번호는 %3d, java 는 %3d, db 는 %3d, web 은 %3d, spring 은 %3d, 총합은 %3d, 평균은 %6.2f 입니다.", 
				name, ban, num, java, db, web, spring, sum, avg);
	}
}
