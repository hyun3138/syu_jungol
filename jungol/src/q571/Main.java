package q571;

import java.util.Scanner;

public class Main {
	public static void print() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i=0; i<num; i++) {
			System.out.println("~!@#$^&*()_+|");
		}
	}
	public static void main(String[] args) {
		print();
	}
}