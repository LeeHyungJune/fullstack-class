package day11;

public class Test08 {
	public Test08() {
		Object[][] obj = new Object[3][5];
		
		Semo[] semo = new Semo[5];
		for(int i = 0 ; i < semo.length ; i++) {
			semo[i] = new Semo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
		}
		Nemo01[] nemo = new Nemo01[5];
		for(int i = 0 ; i < nemo.length ; i++) {
			nemo[i] = new Nemo01((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
		}
		Circle[] won = new Circle[5];
		for(int i = 0 ; i < won.length ; i++) {
			won[i] = new Circle((int)(Math.random() * 21 + 5));
		}
		obj[0] = semo;
		obj[1] = nemo;
		obj[2] = won;
		
		Object o = new Semo();
		Object o2 = new Nemo01();
		Object o3 = new Circle();
		
}
	public static void main(String[] args) {
		new Test08();
	}
	
}
