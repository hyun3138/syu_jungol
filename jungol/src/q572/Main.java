package q572;

import java.util.Scanner;

public class Main {
	public double area(int p) {
		double res = p * p * 3.14;
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		double ret = m.area(r);
		System.out.printf("%.2f", ret);
	}
}
