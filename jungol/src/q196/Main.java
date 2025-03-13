package q196;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[3];
		for (int i = 0; i < person.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			person[i] = new Person(name, tel, addr);
		}
		sc.close();

		Person min = person[0];
		for (int i = 0; i < person.length; i++) {
			int a = min.getName().compareTo(person[i].getName());

			if (a > 0) {
				min = person[i];
			}
		}
		min.print();

	}
}

class Person {
	private String name;
	private String tel;
	private String addr;

	public Person(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	public String getName() {
		return name;
	}

}
