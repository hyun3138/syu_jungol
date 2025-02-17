package q617;

import java.util.Scanner;

class P {
	private String name;
	private int height;
	
	public P(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void print() {
		System.out.println(name + " " + height);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P[] p = new P[5];
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			
			p[i] = new P(name, height);
		}
		sc.close();
		
		P min = p[0];
		
		for(int i=0; i<p.length; i++) {
			if(min.getHeight() > p[i].getHeight()) {
				min = p[i];
			}
		}
		min.print();
	}
}
