package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char[] c = new char[100];
		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
			if (c[i] >= 'A' && c[i] <= 'Z' || c[i] >= 'a' && c[i] <= 'z') {
				System.out.print(String.valueOf(c[i]).toUpperCase());
			}
		}
	}
}
