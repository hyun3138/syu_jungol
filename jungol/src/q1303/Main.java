package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 1;
		for(int i=0; i<n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.printf("%d ", a);
				a++;
			}
			System.out.println();
		}
		sc.close();
	}
}
