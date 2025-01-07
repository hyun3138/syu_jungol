package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		sc.close();
		
		String revers = "";
		for(int i=1; i<=str.length(); i++) {
			revers += str.charAt(str.length()-i);
		}
		if(n > str.length()) {
			System.out.println(revers);
		} else {
			System.out.println(revers.substring(0, n));
		}
	}
}
