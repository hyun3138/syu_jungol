package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		School s = new School(name, school, grade);
		s.print();
	}
}

/* 
import java.util.Scanner;

class School {
	String name;
	String school_name;
	int grade;
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School s = new School();
		s.name = sc.next();
		s.school_name = sc.next();
		s.grade = sc.nextInt();
        sc.close();
		
		System.out.println("Name : " + s.name + " ");
		System.out.println("School : " + s.school_name + " ");
		System.out.println("Grade : " + s.grade);
	}
}
*/