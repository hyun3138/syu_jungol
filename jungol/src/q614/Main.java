package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		School s1 = new School();
		s1.setSchool("Jejuelementary");
		s1.setGrade(6);
		School s2 = new School();
		s2.setSchool(school);
		s2.setGrade(grade);
		
		s1.print();
		s2.print();
	}
}
