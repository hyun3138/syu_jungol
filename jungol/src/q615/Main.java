package q615;

import java.util.Scanner;

class School {
	String name1, name2;
	int k1, k2;
	int e1, e2;
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School s = new School();
		s.name1 = sc.next();
		s.k1 = sc.nextInt();
		s.e1 = sc.nextInt();
		s.name2 = sc.next();
		s.k2 = sc.nextInt();
		s.e2 = sc.nextInt();
		sc.close();
		
		System.out.println(s.name1 + " " + s.k1 + " " +s.e1);
		System.out.println(s.name2 + " " + s.k2 + " " +s.e2);
		System.out.println("avg " + (int)Math.floor((s.k1+s.k2)/2) + " " + (int)Math.floor((s.e1+s.e2)/2));
	}
}