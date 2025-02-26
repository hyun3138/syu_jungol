package q604;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();
		}
		char ch = sc.next().charAt(0);
		sc.close();
		for(int i=0; i<str.length; i++) {
			if(str[i].charAt(str[i].length()-1) == ch) {
				System.out.println(str[i]);
			}
		}
	}
}
