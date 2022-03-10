package day11;
/**
 *	사각형의 정보를 기억할 클래스 Nemo 를 정의하고
 * 필요한 데이터를 입력해서 가로, 세로가 객체가 되는 순간 입력이 되도록 하고
 * 그 클래스의 객체를 5개 관리할 배열을 만들고
 * 배열이 완성되면 출력하시오.
 * 
 * @author LHJ
 * @since 2022/03/10
 */

import java.util.*;

import day10.ex.Student;

public class Test00 {
	String[] names;
	int[] garos;
	int[] seros;
	int[] areas;
	int[] rounds;
	
	Nemo[] nemo;
	
	
	public Test00() {
		
		
		setData();
		
		setNemo();
		
		toPrint();
	}
	
	public void setData() {
		names = new String[] {"A", "B", "C", "D", "E"};
		garos = new int[5];
		seros = new int[5];
		areas = new int[5];
		rounds = new int[5];
		for(int i = 0 ; i < 5 ; i++) {
			garos[i] = (int)(Math.random() * (100 - 60 + 1) + 60);
			seros[i] = (int)(Math.random() * (100 - 60 + 1) + 60);
			areas[i] = garos[i] * seros[i];
			rounds[i] = 2 * (garos[i] + seros[i]);
			
		}
		
	}
	
	public void setNemo() {
		nemo = new Nemo[5];
		for(int i = 0 ; i < nemo.length ; i++) {
			nemo[i] = new Nemo();
		}
		for(int i = 0 ; i < nemo.length ; i++) {
			Nemo n = nemo[i];
			n.setGaro(garos[i]);
			n.setSero(seros[i]);
			n.setName(names[i]);
			n.setArea(areas[i]);
			n.setRound(rounds[i]);
		}
	}
	
	public void toPrint() {
		for(int i = 0 ; i < nemo.length ; i++) {
			String name = nemo[i].getName();
			int garo = nemo[i].getGaro();
			int sero = nemo[i].getSero();
			int area = nemo[i].getArea();
			int round = nemo[i].getRound();
			
			System.out.println("이름 : " + name);
			System.out.println("가로 : " + garo);
			System.out.println("세로 : " + sero);
			System.out.println("넓이 : " + area);
			System.out.println("둘레 : " + round);
			System.out.println();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		}
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test00();
	}

}
