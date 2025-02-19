package q618;

import java.util.Scanner;

class Person{
	private String name;
	private int height;
	private double weight;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}
	
	public String getName() {
		return name;
	}
	
	public double getW() {
		return weight;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			
			p[i] = new Person(name, height, weight);
		}
		sc.close();
		
		for(int i=0; i<p.length-1; i++) {
			for(int j=0; j<p.length-1-i; j++) {
				if(p[j].getName().compareTo(p[j+1].getName()) > 0) {
					Person temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp;
				}
			}
		}
		System.out.println("name");
		for(int i=0; i<p.length; i++) {
			p[i].print();
		}
		
		for(int i=0; i<p.length-1; i++) {
			for(int j=0; j<p.length-1-i; j++) {
				if(p[j].getW() < p[j+1].getW()) {
					Person tp = p[j];
					p[j] = p[j+1];
					p[j+1] = tp;
				}
			}
		}
		System.out.println();
		System.out.println("weight");
		for(int i=0; i<p.length; i++) {
			p[i].print();
		}
				
	}
}
