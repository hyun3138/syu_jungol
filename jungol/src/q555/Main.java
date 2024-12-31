package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[10]; 
		for(int i=0; i<s.length; i++) {
			s[i] = sc.next();
			System.out.print(s[i]);
		}
		sc.close();
	}
}
/*
char[] ar = new char[10];
for(int i=0; i<ar.length; i++) {
	ar[i] = sc.next().charAt(0);
}
sc.close();
for(int i=0; i<ar.length; i++) {
	System.out.println(ar[i]);
}
*/