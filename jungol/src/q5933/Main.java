package q5933;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i=1; i<=n; i++) {
			for(int ii=1; ii<=n; ii++) {
				System.out.print(i * ii + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
