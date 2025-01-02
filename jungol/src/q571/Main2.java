package q571;

import java.util.Scanner;

public class Main2 {
	public void print() {
		System.out.println("~!@#$^&*()_+|");
	}
	
	public static void print2() {
		System.out.println("~!@#$^&*()_+|");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		//1. instance method
		Main2 m1 = new Main2();
		for(int i=0; i<num; i++) {
			m1.print();
		}
		/*
		//2. static method
		print2();
		Main2.print2(); */
	}
}
