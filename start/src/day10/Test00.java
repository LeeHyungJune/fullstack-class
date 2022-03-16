package day10;

public class Test00 {
	int[] rads;
	double[] arrounds;
	double[] areas;
	
	Circle[] c;
	
	
	
	public Test00() {
		setData();
		
		setCircle();
		
		toPrint();
	}
	
	public void setCircle() {
		c = new Circle[3];
		for(int i = 0 ; i < 3 ; i++) {
			c[i] = new Circle();
		}
		for(int i = 0 ; i < 3 ; i++) {
			Circle a = c[i];
			
			a.setRad(rads[i]);
			a.setArea(areas[i]);
			a.setArround(arrounds[i]);
		}
	}
	
	public void setData() {
		rads = new int[3];
		areas = new double[3];
		arrounds = new double[3];
		for(int i = 0 ; i < 3 ; i++) {
			rads[i] = (int)(Math.random() * 21 + 5); 
			areas[i] = rads[i] * rads[i] * Math.PI;
			arrounds[i] = rads[i] * 2 * Math.PI;
		}
	}
	public void toPrint() {
		for(int i = 0 ; i < 3 ; i++) {
			int rad = c[i].getRad();
			double area = c[i].getArea();
			double arround = c[i].getArround();
			
			System.out.printf("이 원은 반지름이 %3d 이고 둘레가 %6.2f 이고 면적이 %6.2f 입니다", rad, arround, area);
			System.out.println();
			}
	}	
	public static void main(String[] args) {
		new Test00();

	}

}
