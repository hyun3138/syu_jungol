package q514;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("height = ");
		int height = sc.nextInt();
		sc.close();
		System.out.printf("Your height is %dcm.", height);
	}
}
