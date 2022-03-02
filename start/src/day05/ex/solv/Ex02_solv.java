package day05.ex.solv;

public class Ex02_solv {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		
			System.out.print(ch);
		}
		int i = 0;
		for(i = 0; i < 10 ; i++) {
			char ch = 'A';
			System.out.println((char)(ch + i) + " ");
		}
		System.out.println();
		System.out.println("## i : " + i);
	}
}
