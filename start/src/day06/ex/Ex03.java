package day06.ex;

/*
 	ex 03)
 		
모두 중첩된 for 문으로 출력하시오		
 		
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5
|-> 이거 출력하기

1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
|-> 이거 출력하기

1 2 3 4 5
2 3 4 5 6
3 4 5 6 7 
4 5 6 7 8
5 6 7 8 9
|-> 이거 출력하기

1  2  3  4   5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20 
21 22 23 24 25
|-> 이거 출력하기

1
1 2
1 2 3 
1 2 3 4 
1 2 3 4 5
|-> 이거 출력하기

 1
 2  3
 4  5  6 
 7  8  9 10
11 12 13 14 15
|-> 이거 출력하기
 */

public class Ex03 {

	public static void main(String[] args) {
		for(int i = 1 ; i < 6 ; i++) { 			// 1번
			for(int j = 1 ; j < 6 ; j++) {
			int a = i;
			int b = (j - (j-1));
			System.out.print(a+" ");
		}
			System.out.println();
			
		}	
		System.out.println();
		for(int i = 0 ; i < 5 ; i++) {			// 2번
			for(int j = 1 ; j < 6 ; j++) {
			int a = i + 1;
			int b = (j);
			System.out.print(b+" ");
		}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0 ; i < 5 ; i++) {			// 3번 
			for(int j = 1 ; j < 6 ; j++) {
			int a = i + 1;
			int b = (j + i);
			System.out.print(b+"\t");
		}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0 ; i < 5 ; i++) {			// 4번 
			for(int j = 1 ; j < 6 ; j++) {
			int a = i + 1;
			int b = (j + (5 * i));
			System.out.print(b+"\t");
		}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println();
		for(int i = 1 ; i < 5 ; i++) {
			for(int j = 1 ; j < 6 ; j++) {
			int a = i + 1;
			int b = (j - (j - i));
			System.out.print(b+"\t");
		}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] a = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		for(int i = 0 ; i < a.length ; i++) {
			for(int n : a[i]) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}
}
