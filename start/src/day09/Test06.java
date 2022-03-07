package day09;

public class Test06 {
	int num;
	public Test06() {
		setNum();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test06();
		
		Test06 t6 = new Test06();
		t6.num = 100;
	}
	public void setNum() {
		int no = (int)(Math.random() * 10 + 1);
		num = no;
		
		// return no;
	}
}
